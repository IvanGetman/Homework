package HomeworkLesson_10;

import java.util.*;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 10.02.2021
 */
public class HomeworkLesson_10 {
    private static final String words = "God save our gracious Queen " +
            "Long live our noble Queen " +
            "God save our gracious King " +
            "Long live our noble King " +
            "God save the Queen " +
            "God save the King ";

    public static void main(String[] args) {

        String[] strings = words.split(" ");
        HashSet<String> uniqueWords = new HashSet<>();
        Collections.addAll(uniqueWords, strings);
        System.out.println("Уникальные слова: " + uniqueWords);
        counterUniqueWords(strings, uniqueWords);


    }

    private static void counterUniqueWords(String[] strings, HashSet<String> uniqueWords) {
        for (String uniqueWord : uniqueWords) {
            int scoore = 0;
            for (String string : strings) {
                if (uniqueWord.equals(string)) scoore++;
            }
            System.out.println("Слово " + uniqueWord + " встречается " + scoore + " раз(а)");
        }
    }

}
