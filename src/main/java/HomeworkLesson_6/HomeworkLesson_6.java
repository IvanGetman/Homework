package HomeworkLesson_6;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 26.01.2021
 */
public class HomeworkLesson_6 {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Мурзик", 10),
                new Cat("Полосатик", 8),
                new Cat("Пузатик", 5),
                new Cat("Мохнатик", 6),
                new Cat("Пушистик", 4),
        };

        Plate plate = new Plate(11);
        plate.plateInfo();

        for (Cat c : cats) {
            c.eat(plate);
            System.out.println(c.getName() + " cытость: " + c.isSatiety());
        }

        plate.putFood(30);

        for (Cat c : cats) {
            c.eat(plate);
            System.out.println(c.getName() + " cытость: " + c.isSatiety());
        }
    }
}
