package com.company.lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isEatUp = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        isEatUp = p.decreaseFood(appetite);
    }

    public void infoCat(){
        System.out.println(name + " " + isEatUp);
    }
    @Override
    public String toString(){
        String str = "";
        if(isEatUp) str =  name + " cыт";
        else str = name + " голоден";

        return str;
    }

}
