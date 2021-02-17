package HomeworkLesson_12;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 17.02.2021
 */
public class HomeworkLesson_12 extends Thread {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        createArrayOneThread();
        createArrayTwoThread();
    }


    public static void createArrayOneThread() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        extractedMetod(arr, SIZE);
        new HomeworkLesson_12().start();
        System.out.println("Время расчета массива одним потоком: " + (System.currentTimeMillis() - a));
    }

    private static void extractedMetod(float[] arr, int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static void createArrayTwoThread() {
        float[] arr = new float[SIZE];
        float[] arr_1 = new float[HALF];
        float[] arr_2 = new float[HALF];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr_1, 0, HALF);
        System.arraycopy(arr, HALF, arr_2, 0, HALF);

        long b = System.currentTimeMillis();

        new HomeworkLesson_12().start();
        new HomeworkLesson_12().start();

        long c = System.currentTimeMillis();
        extractedMetod(arr_1, HALF);
        long d = System.currentTimeMillis();
        extractedMetod(arr_2, HALF);

        long e = System.currentTimeMillis();
        System.arraycopy(arr_1, 0, arr, 0, HALF);
        System.arraycopy(arr_1, 0, arr, HALF, HALF);

        System.out.println("Время разбивки массива на 2 двумя потоками: " + (b - a));
        System.out.println("Время расчета массива 1/2 двумя потоками: " + (d - c));
        System.out.println("Время расчета массива 2/2 двумя потоками: " + (e - d));
        System.out.println("Время Склейки массива двумя потоками: " + (System.currentTimeMillis() - e));
        System.out.println("Время расчета массива ИТОГО двумя потоками: " + (System.currentTimeMillis() - a));
    }

}
