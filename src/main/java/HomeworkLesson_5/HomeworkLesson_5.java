package HomeworkLesson_5;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 21.01.2021
 */
public class HomeworkLesson_5 {
    public static void main(String[] args) {

        Cat cat_1 = new Cat("Барсик");
        Dog dog_1 = new Dog("Бобик");
        Cat cat_2 = new Cat("Мурзик");
        Dog dog_2 = new Dog("Шарик");
        Dog dog_3 = new Dog("Хатико");
        cat_1.run(300);
        cat_1.swim(300);
        cat_2.run(0);
        dog_1.run(300);
        dog_1.swim(500);
        dog_2.run(0);
        dog_2.swim(0);
        dog_3.run(501);
        dog_3.swim(5);



    }
}
