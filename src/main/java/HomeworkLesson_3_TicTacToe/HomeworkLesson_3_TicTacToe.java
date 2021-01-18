package HomeworkLesson_3_TicTacToe;

import java.util.Random;
import java.util.Scanner;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 12.01.2021
 */
public class HomeworkLesson_3_TicTacToe {

    public static char[][] field;
    public static int fieldSizeX = 5;
    public static int fieldSizeY = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_HUMAN = 'X';
    public static final char DOT_AI = 'O';
    public static final char DOT_EMPTY = '.';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static int x_Ai;
    public static int y_Ai;

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            humanTurn();
            printField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Победил человек!");
                break;
            }
            if (checkDraw()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(DOT_AI)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (checkDraw()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void initField() {
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    public static void printField() {
        System.out.print("N" + "|");
        for (int x = 0; x < fieldSizeX; x++) {
            System.out.print(x + 1 + "|");
        }
        System.out.println();
        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print(y + 1 + "|");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.printf("Введите координаты хода через пробел в формате X Y, от 1 до %d для X, от 1 до %d для Y: ", fieldSizeX, fieldSizeY);
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x) || !isCellEmpty(y, x));
        field[y][x] = DOT_HUMAN;

    }

    public static void aiTurn() {

        outerloop:
        for (int number = DOTS_TO_WIN - 1; number > 0; number--) {
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    if (isCellEmpty(y, x)) {
                        if (checkAiTurn(y, x, DOT_AI, number) || checkAiTurn(y, x, DOT_HUMAN, number)) {
                            // сначала проверяем точки на линии длиной DOTS_TO_WIN - 1, если их нет, то линии меньше
                            y_Ai = y;
                            x_Ai = x;
                            break outerloop;
                        }
                    }
                }
            }
        }

        System.out.println("Координаты хода компьютера в формате X Y: " + (x_Ai + 1) + " " + (y_Ai + 1));
        field[y_Ai][x_Ai] = DOT_AI;
    }

    public static boolean checkAiTurn(int y, int x, char symb, int number) {
        // if можно менять местами, чтобы поменять логику проверки
        if (isCellValid(y, x + 1) && checkSymbHor(y, x + 1, symb) == number)
            return true; // проверяем линию справа от точки
        if (isCellValid(y + 1, x) && checkSymbVer(y + 1, x, symb) == number)
            return true; // проверяем линию снизу от точки
        if (isCellValid(y - number, x) && checkSymbVer(y - number, x, symb) == number)
            return true; // проверяем линию сверху от точки
        if (isCellValid(y, x - number) && checkSymbHor(y, x - number, symb) == number)
            return true; // проверяем линию слева от точки
        if (isCellValid(y + 1, x + 1) && checkSymbDia_1(y + 1, x + 1, symb) == number)
            return true; // проверяем диагональ вниз и вправо от точки
        if (isCellValid(y - number, x - number) && checkSymbDia_1(y - number, x - number, symb) == number)
            return true; // проверяем линию вверх и влево от точки
        if (isCellValid(y - number, x + number) && checkSymbDia_2(y - number, x + number, symb) == number)
            return true; // проверяем диагональ вверх и вправо от точки
        if (isCellValid(y + 1, x - 1) && checkSymbDia_2(y + 1, x - 1, symb) == number)
            return true; // проверяем значение вниз и влево от точки
        return false;
    }

    public static boolean isCellValid(int y, int x) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    public static boolean isCellEmpty(int y, int x) {
        return field[y][x] == DOT_EMPTY;
    }

    public static boolean checkWin(char symb) {

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (checkSymbHor(y, x, symb) == DOTS_TO_WIN || checkSymbVer(y, x, symb) == DOTS_TO_WIN || checkSymbDia_1(y, x, symb) == DOTS_TO_WIN || checkSymbDia_2(y, x, symb) == DOTS_TO_WIN)
                    return true;
            }
        }
        return false;
    }

    public static int checkSymbHor(int y, int x, char symb) {
        int counter = 0;
        for (; x < fieldSizeX; x++) {
            if (field[y][x] == symb) counter++;
            else break;
        }
        return counter;
    }

    public static int checkSymbVer(int y, int x, char symb) {
        int counter = 0;
        for (; y < fieldSizeX; y++) {
            if (field[y][x] == symb) counter++;
            else break;
        }
        return counter;
    }

    public static int checkSymbDia_1(int y, int x, char symb) {
        int counter = 0;
        for (; x < fieldSizeX && y < fieldSizeY; x++, y++) {
            if (field[y][x] == symb) counter++;
            else break;
        }
        return counter;
    }

    public static int checkSymbDia_2(int y, int x, char symb) {
        int counter = 0;
        for (; x > 0 && x < fieldSizeX && y < fieldSizeY; x--, y++) {
            if (field[y][x] == symb) counter++;
            else break;
        }
        return counter;
    }

    public static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
