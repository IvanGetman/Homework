package HomeworkLesson_1;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 29.12.2020
 */

public class HomeworkLesson_1 {
    public static void main(String[] args) {
//        byte byteValue = 1;
//        short shortValue = 1256;
//        int intValue = 999241;
//        long longValue = 1223456778L;
//        float floatValue = 125.125f;
//        double doubleValue = 125.125;
//        char charValue = 'g';
//        boolean booleanValue = false;

        System.out.println(calculate(1.23f, 3.21f, 4.56f, 10.74f));

        System.out.println(task10and20(5, 16));

        isPositiveOrNegative(0);

        System.out.println(isNegative(-10));

        SayHello("Vasya");

        checkYears(2000);

        checkYears(1700);

        checkYears(1600);

    }

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void isPositiveOrNegative(int a) {
        if (a < 0) System.out.println(a + " is Negative");
        else System.out.println(a + " is Positive");
    }

    public static boolean isNegative(int a) {
        return a < 0;
    }

    public static void SayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void checkYears(int years) {
        if ((years % 4 == 0) && ((years % 400 == 0) || (years % 100 != 0))) {
            System.out.println(years + " - високосный год");
        } else {
            System.out.println(years + " - не високосный год");
        }
    }

//    Wiki: год, номер которого кратен 400, — високосный;
//    остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
//    остальные годы, номер которых кратен 4, — високосные
}

