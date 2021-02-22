package HomeworkLesson_13;

import java.util.concurrent.BrokenBarrierException;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 18.02.2021
 */
public class HomeworkLesson_13 {

    public static final int CARS_COUNT = 4;


    public static void main(String[] args) {
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Машины готовятся к старту!!!");

        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
        try {
            while (Car.BARRIER.getNumberWaiting() != CARS_COUNT) Thread.sleep(300);
            Car.BARRIER.await();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
            while (Car.BARRIER.getNumberWaiting() != CARS_COUNT) Thread.sleep(300);
            Car.BARRIER.await();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}






