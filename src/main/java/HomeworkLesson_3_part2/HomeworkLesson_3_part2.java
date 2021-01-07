package HomeworkLesson_3_part2;

import java.util.Scanner;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 06.01.2021
 */
public class HomeworkLesson_3_part2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] words = {"apple", "apricot", "avocado", "banana", "broccoli", "carrot", "cherry", "garlic", "grape", "kiwi", "leak", "lemon", "mango", "melon", "mushroom", "nut", "olive", "orange", "pea", "peanut", "pear", "pepper", "pineapple", "potato", "pumpkin"};
        String answer = words[(int) (Math.random() * words.length)];

        while (true) {
            System.out.println("Угадайте овощ/фрукт:");
            String userAnswer = scanner.next();
            if (userAnswer.equals(answer)) {
                System.out.println("Вы угадали!");
                break;
            } else {
                System.out.print("Результат сравнения слов: ");
                System.out.println(checkWords(answer, userAnswer));
            }
        }
    }

    public static char[] checkWords(String answer, String userAnswer) {
        char[] checkWords = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        for (int i = 0; i < userAnswer.length() && i < answer.length(); i++) {
            if (userAnswer.charAt(i) == answer.charAt(i)) {
                checkWords[i] = userAnswer.charAt(i);
            }
        }
        return checkWords;
        // из метода char[] выводилось в консоль почему-то кваказябрами. Методом тыка проблема решена, но как непонятно, что-то с кодировкой видимо.
    }
}
