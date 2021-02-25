package HomeworkLesson_14;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 25.02.2021
 */
@RunWith(Parameterized.class)
public class TestHomeworkLesson_14 {

    @Parameterized.Parameters
    public static Collection<Integer[]> params() {
        return Arrays.asList(new Integer[][]{
                {Arrays.asList(0, 2, 3, 52, 3, 23, 4, 5, 5), Arrays.asList(5, 5)},
                {Arrays.asList(0, 2, 4, 52, 3, 23, 5, 5, 5), Arrays.asList(52, 3, 23, 5, 5, 5)},

        });
    }

    private Integer[] a, b;

    public TestHomeworkLesson_14(Integer[] a, Integer[] b) {
        this.a = a;
        this.b = b;
    }

    @Test
    public void testCutArray() {
        Assert.assertArrayEquals(a, HomeworkLesson_14.cutArray(b));
    }


}
