package HomeworkLesson_7;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 27.01.2021
 */
public interface RunJump {
    String getType();

    String getName();

    int getMaxRun();

    float getMaxJump();

    default void runJump(int length, float altitude) {
        if (length == 0) jump(altitude);
        if (altitude == 0) run(length);
    }

    default void run(int length) {
        if (length > getMaxRun())
            System.out.println(getType() + " " + getName() + " не смог пробежать " + length + " м. и сошел с дистанции!");
        else System.out.println(getType() + " " + getName() + " смог пробежать " + length + " м.");
    }

    default void jump(float altitude) {
        if (altitude > getMaxJump())
            System.out.println(getType() + " " + getName() + " не смог перепрыгнуть " + altitude + " м. и сошел с дистанции!");
        else System.out.println(getType() + " " + getName() + " смог перепрыгнуть " + altitude + " м.");
    }

}
