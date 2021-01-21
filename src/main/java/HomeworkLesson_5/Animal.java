package HomeworkLesson_5;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 21.01.2021
 */
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int length) {
        System.out.println(name + " пробежал " + length + " метров");
    }

    public void swim(int length) {
        System.out.println(name + " проплыл " + length + " метров");
    }

}
