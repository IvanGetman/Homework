package HomeworkLesson_7;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 27.01.2021
 */
public class Cat implements RunJump {
    private String name;
    private int maxRun;
    private float maxJump;

    public Cat(String name, int maxRun, float maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }


    @Override
    public void runJump(int length, float altitude) {
        if (altitude > this.maxJump)
            System.out.println("Котейка " + this.name + " не смог перепрыгнуть " + altitude + " м.");
        else System.out.println("Котейка " + this.name + " смог перепрыгнуть " + altitude + " м.");
        if (length > this.maxRun) System.out.println("Котейка " + this.name + " не смог пробежать " + length + " м.");
        else System.out.println("Котейка " + this.name + " смог пробежать " + length + " м.");
    }
}
