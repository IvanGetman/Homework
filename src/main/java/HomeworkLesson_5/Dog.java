package HomeworkLesson_5;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 21.01.2021
 */
public class Dog extends Animal {
    static int counter;
    int id;

    public Dog(String name) {
        super(name);
        this.id = ++counter;
    }

    @Override
    public void run(int length) {
        if (length <= 0) System.out.println("Пёсель " + this.name + " не бежал");
        else if (length > 500) System.out.println("Пёсель " + this.name + " пробежал 500 метров и устал");
        else super.run(length);
    }

    @Override
    public void swim(int length) {
        if (length <= 0) System.out.println("Пёсель " + this.name + " не пошел в воду");
        else if (length > 10) System.out.println("Пёсель " + this.name + " проплыл 10 метров и устал");
        else super.swim(length);
    }
}
