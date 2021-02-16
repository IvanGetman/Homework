package HomeworkLesson_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 14.02.2021
 */
public class HomeworkLesson_11 {
    public static void main(String[] args) {

        // массивы
        String[] array = {"11", "br", "22", "33", "arr", "-6", "lol", "099", "-ogg", "gre", "3f4", "g5t5"};
        System.out.println(Arrays.toString(array));
        changeElements(array, 1, 9);
        System.out.println(Arrays.toString(array));
        convertArrayToList(array);

        // боксы
        Box<Apple> appleBox_1 = new Box<Apple>();
        for (int i = 0; i < 50; i++) {
            appleBox_1.add(new Apple());
        }
        Box<Apple> appleBox_2 = new Box<Apple>();
        for (int i = 0; i < 75; i++) {
            appleBox_2.add(new Apple());
        }
        Box<Orange> orangeBox = new Box<Orange>();
        for (int i = 0; i < 50; i++) {
            orangeBox.add(new Orange());
        }

        System.out.println(appleBox_1.compare(appleBox_2));
        System.out.println(appleBox_2.compare(orangeBox));

        appleBox_2.moveFruits(appleBox_1);
        System.out.println(appleBox_1.getWeightBox());
        System.out.println(appleBox_2.getWeightBox());

    }

    public static String[] changeElements(String[] arr, int numElem1, int numElem2) {
        String temp = arr[numElem1 - 1];
        arr[numElem1 - 1] = arr[numElem2 - 1];
        arr[numElem2 - 1] = temp;
        return arr;
    }

    public static ArrayList<String> convertArrayToList(String[] arr) {
        ArrayList<String> arrayList = new ArrayList(arr.length);
        Collections.addAll(arrayList, arr);
        return arrayList;
    }
}
