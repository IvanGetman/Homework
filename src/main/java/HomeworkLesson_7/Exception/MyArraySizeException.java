package HomeworkLesson_7.Exception;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 02.02.2021
 */
public class MyArraySizeException extends IndexOutOfBoundsException{
    public MyArraySizeException(String s) {
        super(s);
    }
}
