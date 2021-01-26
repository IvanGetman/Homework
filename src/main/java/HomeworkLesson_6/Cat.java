package HomeworkLesson_6;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 26.01.2021
 */
public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (p.getFood() < this.appetite) {
            System.out.println(this.name + " остался голодным, в тарелке осталось " + p.getFood() + " еды");
        } else {
            p.decreaseFood(appetite);
            System.out.println(this.name + " покушал " + this.appetite + " еды, в тарелке осталось " + p.getFood() + " еды");
            this.satiety = true;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }
}
