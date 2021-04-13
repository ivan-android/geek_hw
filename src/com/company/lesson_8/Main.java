package com.company.lesson_8;


import com.company.lesson_7.Plate;

public class Main {


    public static void main(String[] args) {

        Obstruction[] obstructions = {new Treadmill(15), new Wall(1), new Treadmill(2)};
        Doing[] doings = {new Cat(5, 10), new Human(9, 15),
                new Robot(10, 11)};
        for (int i = 0; i < doings.length; i++) {
            for (int j = 0; j < obstructions.length; j++) {
                if (obstructions[j] instanceof Wall) {
                    ((Wall)obstructions[j]).jumpWall((Jumpebyl) doings[i]);
                    if(!((Wall)obstructions[j]).getIsJumpSuccess()) break;
                }else if (obstructions[j] instanceof Treadmill){
                    ((Treadmill)obstructions[j]).runTreadmill((Runebyl) doings[i]);
                    if(!((Treadmill)obstructions[j]).getIsRunSuccess()) break;
                }
            }
        }









    }


}


