package HomeworkLesson_5;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 21.01.2021
 */
public class Cat extends Animal {
    static int counter;
    int id;

    public Cat(String name) {
        super(name);
        this.id = ++counter;
    }

    @Override
    public void swim(int length) {
        System.out.println("Котики боятся плавать!");
    }

    @Override
    public void run(int length) {
        if (length <= 0) System.out.println("Котик " + this.name + " не бежал");
        else if (length > 200) System.out.println("Котик " + this.name + " пробежал 200 метров и устал");
        else super.run(length);
    }
}
