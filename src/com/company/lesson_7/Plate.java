package com.company.lesson_7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        boolean isEat;
        if(food < n){
            System.out.println("В тарелке недостаточно еды!");
            isEat = false;
        }
        else {
            food -= n;
            isEat = true;
        }
        return isEat;
    }
    public void addFood(int newFood){
        food = food + newFood;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
