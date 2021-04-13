package com.company.lesson_8;

public class Cat implements Jumpebyl, Runebyl {
    private int jumpMax;
    private int runMax;

    public Cat(int jumpMax, int runMax){
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
        System.out.println("Кот пробежал");
    }

    public void jump(){
        System.out.println("Кот прыгнул");
    }

}
