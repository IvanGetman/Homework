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
    private String name;
    private int maxRun;
    private float maxJump;

    public Robot(String name, int maxRun, float maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }


    @Override
    public void runJump(int length, float altitude) {
        if (altitude > this.maxJump)
            System.out.println("Робот " + this.name + " не может перепрыгнуть " + altitude + " м.");
        else System.out.println("Робот " + this.name + " перепрыгнул " + altitude + " м.");
        if (length > this.maxRun) System.out.println("Робот " + this.name + " не может пробежать " + length + " м.");
        else System.out.println("Котейка " + this.name + " пробежал " + length + " м.");
    }
}
