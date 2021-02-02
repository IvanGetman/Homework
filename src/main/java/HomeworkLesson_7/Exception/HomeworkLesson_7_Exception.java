package HomeworkLesson_7.Exception;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 02.02.2021
 */
public class HomeworkLesson_7_Exception {
    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"-1", "-2", "-3", "-4"},
                {"-5", "-6", "-7", "10"},
        };

        String[][] arr2 = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"-1", "-2", "-3", "-4"},
                {"-5", "-6", "-7", "ERROR"},
        };

        String[][] arr3 = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8", "0"},
                {"-1", "-2", "-3", "-4"},
                {"-5", "-6", "-7", "6"},


        };

        System.out.println("Проверка массива arr:");
        arraySumSize4x4(arr);
//        System.out.println("Проверка массива arr2:");
//        arraySumSize4x4(arr2);
        System.out.println("Проверка массива arr3:");
        arraySumSize4x4(arr3);

    }

    public static void arraySumSize4x4(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4 || arr[i].length != 4)
                throw new MyArraySizeException("Массив должен быть размером 4x4!!!");
            for (int j = 0; j < arr[0].length; j++) {
                if (!checkNumber(arr[i][j]))
                    throw new MyArrayDataException("В ячейке " + (i + 1) + " " + (j + 1) + " лежит не число!!!");
                sum += Integer.parseInt(arr[i][j]);
            }
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }

    public static boolean checkNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

