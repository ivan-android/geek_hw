package com.company.lesson_4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin0(DOT_X)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin0(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра закончилась!");
        scanner.close();
    }
    public static boolean isMapFull(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean checkWin0_3_3(char symb) {
        boolean resultX = false;
        boolean resultY = false;
        boolean resultDiagX = true;
        boolean resultDiagY = true;
        for (int i = 0; i < map.length; i++) {
            if (resultX == true) {
                break;
            }
            for (int j = 0; j < map.length; j++) {
                resultX = true;
                if (map[i][j] != symb) {
                    resultX = false;
                    break;
                }
            }
        }

        for (int i = 0; i < map.length; i++) {
            if (resultY == true) {
                break;
            }
            for (int j = 0; j < map.length; j++) {
                resultY = true;
                if (map[j][i] != symb) {
                    resultY = false;
                    break;
                }
            }
        }

        for (int i = 0; i < map.length; i++) {
            if(map[i][i] != symb) resultDiagX = false;
        }

        for (int i = 0; i < map.length; i++) {
            if(map[map.length - i - 1][i] != symb) resultDiagY = false;
        }
        return (resultDiagX || resultDiagY || resultX || resultY);
    }

    public static boolean checkWin0(char symb) {
        boolean result = false;
        char[][] revMap = rotate(map);

        for (int i = 0; i < map.length; i++) {
            if (isWinForLine(map[i], symb)) result = true;
        }
        for (int i = 0; i < map.length; i++) {
            if (isWinForLine(revMap[i], symb)) result = true;
        }



        return result;
    }

    public static char[][] rotate(char[][] matrix) {
        char[][] ret = new char[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                ret[i][j] = matrix[matrix.length - j - 1][i];
            }
        }
        return ret;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while (!isValidTurn(x, y));
        map[y][x] = DOT_X;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }while (!isValidTurn(x, y));
        System.out.println("Компьютер сделал ход: " + (x+1) + " " + (y+1));
        map[y][x] = DOT_O;
    }
    public static boolean isValidTurn(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static boolean isWinForLine(char[] lineChar, char dotType) {
        int numbers = SIZE - DOTS_TO_WIN + 1;
        boolean result = false;
        for (int i = 0; i < numbers; i++) {
            if (result == true) {
                break;
            }
            for (int j = i; j < DOTS_TO_WIN + i; j++) {
                result = true;
                if (lineChar[j] != dotType) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

}


