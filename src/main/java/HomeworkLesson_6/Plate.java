package HomeworkLesson_6;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 26.01.2021
 */
public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int food) {
        this.food -= food;
        if (this.food < 0) this.food = 0;
    }

    public void plateInfo (){
        System.out.println("В тарелке " + this.food + " еды");
    }

    public void putFood (int food){
        this.food += food;
        System.out.println("В тарелку положили " + food + " еды");
    }

    public int getFood() {
        return food;
    }
}
