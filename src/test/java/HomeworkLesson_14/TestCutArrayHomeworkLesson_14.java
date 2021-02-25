package HomeworkLesson_14;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
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
public class TestCutArrayHomeworkLesson_14 {

    @Parameterized.Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(new Object[][][]{
                {new Integer[] {1,1,4,1,6,7}, new Integer[] {1,6,7}},
                {new Integer[] {4,1,1,15,1,6,7}, new Integer[] {1,1,15,1,6,7}},
                {new Integer[] {1,1,45,15,1,6,7,4}, new Integer[]{}},
                {new Integer[] {1,1,45,15,1,6,7,1}, new Integer[]{1}},
        });
    }

    private Integer[] a, b;

    public TestCutArrayHomeworkLesson_14(Integer[] a, Integer[] b) {
        this.a = a;
        this.b = b;
    }

    @Test
    public void testCutArray() {
        Assert.assertArrayEquals(b, HomeworkLesson_14.cutArray(a));
    }


}
