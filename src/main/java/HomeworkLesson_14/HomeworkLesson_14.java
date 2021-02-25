package HomeworkLesson_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 23.02.2021
 */
public class HomeworkLesson_14 {
    public static void main(String[] args) {
        Integer[] arr = {0, 2, 3, 52, 5, 6, 9, 3, 23, 4, 5, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(cutArray(arr)));
        Integer[] arr_2 = {1, 1, 1, 4, 1, 4};
        System.out.println(checkArray(arr_2));
    }

    public static Integer[] cutArray(Integer[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 4) {
                arrayList.add(0, arr[i]);
            } else break;
        }
        if (arr.length == arrayList.size()) throw new MyArrayException("В массиве отсутствует цифра 4");
        Integer[] cutArray = new Integer[arrayList.size()];
        arrayList.toArray(cutArray);
        return cutArray;
    }

    public static boolean checkArray(Integer[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>(arr.length);
        Collections.addAll(arrayList, arr);
        for (Integer i : arrayList) if (i != 1 && i != 4) return false;
        return arrayList.contains(1) && arrayList.contains(4);
    }
}
