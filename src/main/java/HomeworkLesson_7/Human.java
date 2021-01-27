package HomeworkLesson_7;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 27.01.2021
 */
public class Human implements RunJump {
    private String name;
    private int maxRun;
    private float maxJump;

    public Human(String name, int maxRun, float maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public void runJump(int length, float altitude) {
        if (altitude > this.maxJump) System.out.println(this.name + " не смог перепрыгнуть " + altitude + " м.");
        else System.out.println(this.name + " смог перепрыгнуть " + altitude + " м.");
        if (length > this.maxRun) System.out.println(this.name + " не смог пробежать" + length + " м.");
        else System.out.println(this.name + " смог пробежать " + length + " м.");

    }
}
