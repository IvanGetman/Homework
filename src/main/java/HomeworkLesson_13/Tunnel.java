package HomeworkLesson_13;

import java.util.concurrent.Semaphore;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 18.02.2021
 */
class Tunnel extends Stage {
    private static final Semaphore SEMAPHORE = new Semaphore(HomeworkLesson_13.CARS_COUNT / 2);

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getNameCar() + " готовится к этапу(ждет): " + description);
                SEMAPHORE.acquire();
                System.out.println(c.getNameCar() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getNameCar() + " закончил этап: " + description);
                SEMAPHORE.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
