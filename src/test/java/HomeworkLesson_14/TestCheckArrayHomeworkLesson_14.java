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
public class TestCheckArrayHomeworkLesson_14 {

    @Parameterized.Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(new Object[][]{
                {new Integer[] {1,1,4,1,1,1}},
                {new Integer[] {1,1,1,4,4,1}},
                {new Integer[] {1,1,1,1,1,1}},
                {new Integer[] {3,1,4,1,1,1}},
        });
    }

    private Integer[] a;

    public TestCheckArrayHomeworkLesson_14(Integer[] a) {
        this.a = a;
    }

    @Test
    public void testCutArray() {
        Assert.assertTrue(HomeworkLesson_14.checkArray(a));
    }


}
