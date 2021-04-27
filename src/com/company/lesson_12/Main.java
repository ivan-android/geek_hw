package com.company.lesson_12;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        //metod1();
        new Thread(() -> metod2()).start();
        new Thread(() -> metod2()).start();




    }

    public static void metod2() {
        long a = 0;
        float[] arr = new float[SIZE];
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);

        synchronized (lock1) {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }

        synchronized (lock2) {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }



        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);


        System.out.println(System.currentTimeMillis() - a + " ms");
        }
    }

    public static void metod1() {
        long a = 0;
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a + " ms");
    }


}


