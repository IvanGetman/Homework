package HomeworkLesson_13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 18.02.2021
 */
public class Car implements Runnable {

    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    public static final CyclicBarrier BARRIER = new CyclicBarrier(HomeworkLesson_13.CARS_COUNT + 1);
    private static int numberWinner = 1;
    Lock lock = new ReentrantLock();

    public String getNameCar() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {


        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            BARRIER.await();
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }

            try {
                lock.lock();
                if (numberWinner == 1) {
                    System.out.println(this.name + " Победитель!!!");
                } else {
                    System.out.println(this.name + " занял место № " + numberWinner);
                }
                numberWinner++;
            } finally {
                lock.unlock();
            }

            BARRIER.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
