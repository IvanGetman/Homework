package HomeworkLesson_7;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 27.01.2021
 */
public class RunTrack extends Obstruction {
    private final int length;

    public RunTrack(int length) {
        this.length = length;
    }

    @Override
    int getLength() {
        return this.length;
    }

    @Override
    float getAltitude() {
        return 0;
    }
}
