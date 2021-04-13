package com.company.lesson_8;

public class Human implements Jumpebyl, Runebyl {
    private int jumpMax;
    private int runMax;

    public Human(int jumpMax, int runMax){
        this.jumpMax = jumpMax;
        this.runMax = runMax;
    }

    public int getJumpMax(){
        return this.jumpMax;
    }

    public int getRunMax(){
        return this.runMax;
    }

    public void run(){
        System.out.println("Человек пробежал");
    }

    public void jump(){
        System.out.println("Человек прыгнул");
    }

}
