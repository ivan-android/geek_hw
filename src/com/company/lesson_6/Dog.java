package com.company.lesson_6;

public class Dog extends Animal{

    public Dog(int runLimit, int swimLimit){
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        countDog++;
    }

    @Override
    public void run(int distRun){
        runLimit = runLimit - distRun;
        if (runLimit >= 0) System.out.println("Собака пробежала " + distRun + " м.");
        else System.out.println("Собака устала!");
    }

    @Override
    public void swim(int distSwim){
        swimLimit = swimLimit - distSwim;
        if (swimLimit >= 0) System.out.println("Собака проплыла " + distSwim + " м.");
        else System.out.println("Собака устала!");
    }
}
