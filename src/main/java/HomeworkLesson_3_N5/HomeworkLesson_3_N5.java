package HomeworkLesson_3_N5;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 14.01.2021
 */
public class HomeworkLesson_3_N5 {

    public static void main(String[] args) {
        int fieldSizeX = 9;
        int fieldSizeY = 6;
        createSnakeArr(fieldSizeX, fieldSizeY);

    }

    public static void createSnakeArr(int fieldSizeX, int fieldSizeY) {
        int[][] snakeArr = new int[fieldSizeY][fieldSizeX];
        int counterNumber = 1;
        int counterUpY = 0;
        int counterDownY = fieldSizeY - 1;
        int counterLeftX = 0;
        int counterRightX = fieldSizeX - 1;

        while (counterNumber <= fieldSizeX * fieldSizeY) {
            for (int x = counterLeftX, y = counterUpY; x <= counterRightX; x++) snakeArr[y][x] = counterNumber++;
            counterUpY++;
            for (int y = counterUpY, x = counterRightX; y <= counterDownY; y++) snakeArr[y][x] = counterNumber++;
            counterRightX--;
            for (int x = counterRightX, y = counterDownY; x >= counterLeftX; x--) snakeArr[y][x] = counterNumber++;
            counterDownY--;
            for (int y = counterDownY, x = counterLeftX; y >= counterUpY; y--) snakeArr[y][x] = counterNumber++;
            counterLeftX++;
        }
        printArr(snakeArr);
    }

    static void printArr(int[][] arr) {
        // печать первой строки
        for (int i = 0; i <= 0; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        // печать последующих строк
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
