package com.company.lesson_7;





public class Main {


    public static void main(String[] args) {

        Plate plate = new Plate(20);
        Cat[] arrCat = {new Cat("Barsik", 5),
                        new Cat("Myrzik", 15),
                        new Cat("Myrca", 10)};
        for (Cat cat: arrCat) {
            cat.eat(plate);
            System.out.println(cat);
        }

    }


}


