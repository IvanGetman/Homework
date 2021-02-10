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
    private static String words = "God save our gracious Queen " +
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
        for (String uniqueWord : uniqueWords) {
            counterUniqueWords(strings, uniqueWord);
        }


    }

    private static void counterUniqueWords(String[] strings, String uniqueWord) {
        int scoore = 0;
        for (int i = 0; i < strings.length; i++) {
            if (uniqueWord.equals(strings[i])) scoore++;
        }
        System.out.println("Слово " + uniqueWord + " встречается " + scoore + " раз(а)");

    }
}
