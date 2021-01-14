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
    public static final char DOT_EMTY = '.';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

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
                field[y][x] = DOT_EMTY;
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
        } while (!isCellValid(x, y) || !isCellEmpty(x, y));
        field[y][x] = DOT_HUMAN;

    }

    public static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        } while (!isCellEmpty(x, y));
        System.out.println("Координаты хода компьютера в формате X Y: " + (x + 1) + " " + (y + 1));
        field[y][x] = DOT_AI;
    }

    public static boolean isCellValid(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;

    }

    public static boolean isCellEmpty(int x, int y) {
        return field[y][x] == DOT_EMTY;
    }

    public static boolean checkWin(char symb) {
        // hor
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x <= fieldSizeX - DOTS_TO_WIN; x++) {
                //дальше координат fieldSizeX - DOTs_TO_WIN линия выйдет за пределы поля
                if (field[y][x] == symb && checkHor(y, x, 1)) return true;
            }
        }
        // ver
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y <= fieldSizeY - DOTS_TO_WIN; y++) {
                if (field[y][x] == symb && checkVer(y, x, 1)) return true;
            }
        }
        // dia
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == symb && (checkDia_1(y, x, 1) || checkDia_2(y, x, 1))) return true;
            }
        }
        return false;
    }

    public static boolean checkHor(int y, int x, int counter) {
        if (field[y][x] != field[y][x + 1]) return false;
        else if (counter == DOTS_TO_WIN - 1) return true;
        else return checkHor(y, x + 1, counter + 1);
    }

    public static boolean checkVer(int y, int x, int counter) {
        if (field[y][x] != field[y + 1][x]) return false;
        else if (counter == DOTS_TO_WIN - 1) return true;
        else return checkVer(y + 1, x, counter + 1);
    }

    public static boolean checkDia_1(int y, int x, int counter) {
        if (!isCellValid(x + 1, y + 1)) return false; //проверяем чтобы следующее значение не вышло за переделы поля
        else if (field[y][x] != field[y + 1][x + 1]) return false;
        else if (counter == DOTS_TO_WIN - 1) return true;
        else return checkDia_1(y + 1, x + 1, counter + 1);
    }

    public static boolean checkDia_2(int y, int x, int counter) {
        if (!isCellValid(x - 1, y + 1)) return false;
        else if (field[y][x] != field[y + 1][x - 1]) return false;
        else if (counter == DOTS_TO_WIN - 1) return true;
        else return checkDia_2(y + 1, x - 1, counter + 1);
    }

    public static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMTY) return false;
            }
        }
        return true;
    }

}
