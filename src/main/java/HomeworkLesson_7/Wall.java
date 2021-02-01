package HomeworkLesson_7;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 27.01.2021
 */
public class Wall extends Obstruction {
    private final float altitude;

    public Wall(float altitude) {
        this.altitude = altitude;
    }


    @Override
    int getLength() {
        return 0;
    }

    @Override
    float getAltitude() {
        return this.altitude;
    }
}
