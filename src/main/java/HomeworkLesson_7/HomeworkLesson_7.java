package HomeworkLesson_7;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 27.01.2021
 */
public class HomeworkLesson_7 {
    public static void main(String[] args) {

        RunJump[] participants = {
                new Human("Борис", 1500, 1.5f),
                new Human("Сергей", 3000, 1.6f),
                new Cat("Борис", 300, 0.5f),
                new Cat("Мурзик", 550, 0.7f),
                new Robot("R2D2", 5000, 0.1f),
                new Robot("Валли", 3500, 0.2f),
        };

        Obstruction[] obstructions = {
                new Wall(0.1f),
                new RunTrack(300),
                new Wall(0.5f),
                new RunTrack(300),
                new Wall(0.5f),
                new RunTrack(3000),
        };

        for (RunJump p : participants) {

        }
    }


}
