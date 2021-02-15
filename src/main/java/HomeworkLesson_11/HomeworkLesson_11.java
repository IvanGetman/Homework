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
        String[] array = {"11", "br", "22", "33", "arr", "-6", "lol", "099", "-ogg", "gre", "3f4", "g5t5"};
        System.out.println(Arrays.toString(array));
        changeElements(array, 1, 9);
        System.out.println(Arrays.toString(array));
        convertArrayToList(array);

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
