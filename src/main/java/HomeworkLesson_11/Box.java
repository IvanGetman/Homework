package HomeworkLesson_11;

import java.util.ArrayList;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 16.02.2021
 */
public class Box<T extends Fruit> {
    ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public float getWeightBox() {
        if (fruits.size() == 0) return 0;
        return fruits.size() * fruits.get(0).getWeightFruit();
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(getWeightBox() - otherBox.getWeightBox()) < 0.0001;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void moveFruits(Box<T> otherBox) {
        otherBox.getFruits().addAll(fruits);
        fruits.clear();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }
}
