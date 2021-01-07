package HomeworkLesson_3;

import java.util.Scanner;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 05.01.2021
 */
public class HomeworkLesson_3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            guessNumber();
            if (checkNumber() == 0) break;
        }
        scanner.close();
    }


    public static void guessNumber() {
        int maxTryCount = 3;
        int range = 10;
        int answer = (int) (Math.random() * range);
        System.out.println("Угадайте число 0 до " + (range - 1) + ". У вас есть " + maxTryCount + " попытки.");
        for (int tryCount = 1; tryCount <= maxTryCount; tryCount++) {
            int userAnswer = scanner.nextInt();
            if (userAnswer == answer) {
                System.out.println("Поздравляем, вы угадали!");
                break;
            } else if (userAnswer < answer) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }
        System.out.println("Загаданное число " + answer);
    }

    public static int checkNumber() {
        int userOption;
        do {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            userOption = scanner.nextInt();
        } while (userOption != 0 && userOption != 1);
        return userOption;
    }
}
