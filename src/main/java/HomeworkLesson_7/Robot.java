package HomeworkLesson_7;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 27.01.2021
 */
public class Robot implements RunJump {
    private final String type = "Робот";
    private final String name;
    private final int maxRun;
    private final float maxJump;

    public Robot(String name, int maxRun, float maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getMaxRun() {
        return this.maxRun;
    }

    @Override
    public float getMaxJump() {
        return this.maxJump;
    }
}
