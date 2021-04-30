package com.company.lesson_13;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Main {

    public static final int CARS_COUNT = 4;
    public static CyclicBarrier barrier = new CyclicBarrier(CARS_COUNT);
    public static Semaphore semaphore = new Semaphore(CARS_COUNT / 2);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        Thread[] threads = new Thread[CARS_COUNT];
        for (int i = 0; i < CARS_COUNT; i++) {
            threads[i] = new Thread(cars[i]);
            threads[i].start();
        }


        Thread.sleep(1400);
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        for (int i = 0; i < CARS_COUNT; i++) {
            threads[i].join();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}



