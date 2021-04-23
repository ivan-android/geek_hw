package com.company.lesson_11;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Box<Apple> box1 = new Box<>();
        box1.addFruit(apple);
        box1.addFruit(apple1);
        box1.addFruit(apple2);
        Box<Apple> box2 = new Box<>();
        box1.pourOver(box2);
        System.out.println(box2.getWeight());


        Integer[] arr = {1, 2, 3, 4, 5};
        arrayEdit(arr);

    }

    public static <T>ArrayList<T> arrayToList(T[] array){

        return new ArrayList<T>(Arrays.asList(array));
    }


    public static <T> void arrayEdit(T[] array){
        T temp;
        if (array.length < 2){
            System.out.println("Ошибка! В массиве мало элементов");
        } else {
            temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        }

    }


}


