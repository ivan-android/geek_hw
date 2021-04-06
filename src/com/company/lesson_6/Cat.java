package com.company.lesson_6;

public class Cat extends Animal{


    public Cat(int runLimit){
        this.runLimit = runLimit;
        countCat++;
    }

    @Override
    public void run(int distRun){
        runLimit = runLimit - distRun;
        if (runLimit >= 0) System.out.println("Кот пробежал " + distRun + " м.");
        else System.out.println("Кот устал!");
    }

    @Override
    public void swim(int distSwim){
        System.out.println("Кот не умеет плавать!");
    }

}
