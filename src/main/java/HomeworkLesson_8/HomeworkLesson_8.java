package HomeworkLesson_8;

import java.io.*;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 04.02.2021
 */
public class HomeworkLesson_8 {
    public static void main(String[] args) throws IOException {

        String text_1 = "God save our gracious Queen (King)! \nLong live our noble Queen (King)! \nGod save the Queen (King)! \nSend her (him) victorious, \nHappy and glorious, \nLong to reign over us: \nGod save the Queen (King).\n";
        String text_2 = "O Lord, our God, arise, \nScatter her (his) enemies, \nAnd make them fall: \nConfound their politics, \nFrustrate their knavish tricks, \nOn Thee our hopes we fix: \nGod save us all.\n";

        File file_1 = writeFile("testHomework_1.txt", text_1);
        File file_2 = writeFile("testHomework_2.txt", text_2);
        File file_out = writeFile("testHomework_out.txt", "");

        mergeFile(file_1, file_2, file_out);
        searchWord(file_1, "God");
        searchWord(file_2, "God");
    }

    public static File writeFile(String nameFile, String textFile) throws IOException {
        File file = new File("src/main/java/HomeworkLesson_8/" + nameFile);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(textFile.getBytes());
        fos.close();
        return file;
    }

    public static void mergeFile(File nameFile_1, File nameFile_2, File nameFile_out) throws IOException {
        FileOutputStream fos = new FileOutputStream(nameFile_out);
        int ch;
        FileInputStream fis = new FileInputStream(nameFile_1);
        while ((ch = fis.read()) != -1) fos.write(ch);
        fis.close();
        fis = new FileInputStream(nameFile_2);
        while ((ch = fis.read()) != -1) fos.write(ch);
        fis.close();
    }

    public static void searchWord(File nameFile, String word) throws IOException {
        FileInputStream fis = new FileInputStream(nameFile);
        byte[] b = word.getBytes();
        int ch;
        int i = 0;

        while ((ch = fis.read()) != -1) {
            if (ch == b[i]) i++;
            else  {
                i = 0;
                if (ch == b[i]) i++;
            }
            if(i == word.length()) {
                fis.close();
                System.out.println("Слово " + word + " присутствует в файле " + nameFile);
                break;
            }
        }
        fis.close();
    }
}
