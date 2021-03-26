package com.company.lesson_3;


import java.util.Random;
import java.util.Scanner;


public class Main {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static final int MAX_NUMBER = 9;
    public static final int TRY_COUNT = 3;
    public static final String[] HIDDEN_WORDS = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {

        hiddenWordsGame();
        //gameHiddenNumber();

        scanner.close();
    }

    public static void hiddenWordsGame(){
        do {
            String hiddenWord = HIDDEN_WORDS[random.nextInt(HIDDEN_WORDS.length)-1];
            do{
                System.out.println("Введите слово: ");
                String useWord = scanner.next();
                if (!hiddenWord.equals(useWord)){
                    System.out.println("Не угадали. Подсказка: " + equalStr(hiddenWord, useWord));
                } else {
                    System.out.println("Вы победили!"); break;
                }
            } while (true);
            System.out.println("Будете продолжать игру? (Y/N)");
        } while(scanner.next().toUpperCase().equals("Y"));

    }

    public static  String equalStr(String hiddenWord, String userWord){
        char[] charsHiddenWord = hiddenWord.toCharArray();
        char[] charsUserWord = userWord.toCharArray();
        char[] charsResult = {'#', '#','#','#','#','#','#','#','#','#','#','#','#','#','#',};
        int wordMinlength = Math.min(charsHiddenWord.length, charsUserWord.length);
        for (int i = 0; i < wordMinlength; i++) {
            if (charsHiddenWord[i] == charsUserWord[i]) charsResult[i] = charsHiddenWord[i];
        }
        return String.copyValueOf(charsResult);

    }

    static public void gameHiddenNumber(){
        int hiddenNumber = random.nextInt(MAX_NUMBER);
        do {
            System.out.println("Угадайте число от 0 до " + MAX_NUMBER);
            boolean isUserWin = false;
            int userTry = TRY_COUNT;
            do {
                System.out.print("Введите число: ");
                int tryNumber = scanner.nextInt();
                if (hiddenNumber != tryNumber){
                    userTry--;
                    if (hiddenNumber < tryNumber) System.out.println("Введенное число больше загаданного");
                    else System.out.println("Введенное число меньше загаданного");
                    if (userTry == 0) System.out.println("Вы проиграли!");
                } else {
                    System.out.println("Поздравляем! Вы победили!");
                    isUserWin = true;
                }

            }while (userTry > 0 && !isUserWin);

            System.out.println("Хотите продолжить игру? (Y/N)");
            String moreGame = "sdfsf";
        } while(scanner.next().equals("Y"));

    }



}


