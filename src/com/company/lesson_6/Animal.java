package com.company.lesson_6;

public abstract class Animal {
    protected int runLimit;
    protected int swimLimit;
    protected static int countDog = 0;
    protected static int countCat = 0;


    public abstract void run(int distRun);
    public abstract void swim(int distSwim);
    public static void getCount(){
        System.out.println("Создано животных: " + (countCat + countDog));
        System.out.println("Создано котов: " + countCat);
        System.out.println("Создано собак: " + countDog);
    }
}
