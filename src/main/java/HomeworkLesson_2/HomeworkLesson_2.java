package HomeworkLesson_2;

import java.util.Arrays;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 02.01.2021
 */
public class HomeworkLesson_2 {
    public static void main(String[] args) {
        invertArray();
        createArray();
        changeArray();
        createDiagonalArray();
        showMinMaxNumbers();
        int[] numbers = {8, 2, 3, 1, 5, 9, 0, 1, 6, 1, 2};
        System.out.println(checkBalance(numbers));
        offsetArray(numbers, -3);

    }

    public static void invertArray() {
        System.out.println("Задание № 1:");
        byte arr[] = {0, 1, 1, 0, 0, 1, 1, 0, 0};
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void createArray() {
        System.out.println("Задание № 2:");
        int arr[] = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArray() {
        System.out.println("Задание № 3:");
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void createDiagonalArray() {
        System.out.println("Задание № 4:");
        int arr[][] = new int[9][9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || (j == arr.length - 1 - i)) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void showMinMaxNumbers() {
        System.out.println("Задание № 5:");
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 0};
        int minNumbers = arr[0];
        int maxNumbers = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumbers) {
                minNumbers = arr[i];
            }
            if (arr[i] > maxNumbers) {
                maxNumbers = arr[i];
            }
        }
        System.out.println("Минимальное число массива " + minNumbers);
        System.out.println("Максимальное число массива " + maxNumbers);
    }

    public static boolean checkBalance(int numbers[]) {
        System.out.println("Задание № 6:");
        int summLeft = 0;
        int summRight = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            summLeft += numbers[i];
            for (int j = numbers.length - 1; j > i; j--) {
                summRight += numbers[j];
            }
//            System.out.print(summLeft + " ");
//            System.out.println(summRight);

            if (summLeft == summRight) {
                break;
            } else {
                summRight = 0;
            }
        }
        return summLeft == summRight;
    }

    public static void offsetArray(int numbers[], int n) {
        System.out.println("Задание № 7:");
        int[] offsetNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if ((i + n >= 0) && (i + n < numbers.length)) {
                offsetNumbers[i + n] = numbers[i];
            } else if (i + n >= numbers.length) {
                offsetNumbers[(i + n) % (numbers.length)] = numbers[i];
            } else {
                offsetNumbers[numbers.length + i + n] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers) + " Исходный массив");
        System.out.println(Arrays.toString(offsetNumbers) + " Массив со смещением элементов на " + n);
    }
}

