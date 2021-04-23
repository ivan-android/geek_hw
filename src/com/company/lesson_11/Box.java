package com.company.lesson_11;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> listFruits = new ArrayList<>();

    public void addFruit(T fruit) {
        listFruits.add(fruit);
    }

    public void compare (Box<?> anotherBox){
        if (Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001){
            System.out.println("Коробки равны");
        } else {
            System.out.println("Коробки не равны");
        }
    }

    public void pourOver(Box<T> anotherBox) {
        for (int i = 0; i < listFruits.size(); i++) {
            anotherBox.addFruit(listFruits.get(i));
            listFruits.remove(i);
        }
    }

    public double getWeight() {
        if (listFruits.size() == 0) {
            return 0;
        } else if (listFruits.get(0) instanceof Apple) {
            return listFruits.size() * 1.0;
        } else if (listFruits.get(0) instanceof Orange) {
            return listFruits.size() * 1.5;
        } else  return 0;
    }

}
