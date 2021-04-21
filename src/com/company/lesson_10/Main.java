package com.company.lesson_10;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] arrStr = {"ветер", "лента", "ветер", "лента","ветер","гвозди","ветер", "хвост"};
        //workWithArray(arrStr);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(8950, "Попов");
        phoneBook.addContact(8951, "Попов");
        phoneBook.addContact(8952, "Сидоров");
        for(Integer elem: phoneBook.getPhone("Попов")){
            System.out.println(elem);
        }

    }

    public static void workWithArray (String[] arrStr) {
        Arrays.sort(arrStr);
        Set<String> set = new HashSet<String>(Arrays.asList(arrStr));
        for (String strEl: set) {
            System.out.println(strEl);
        }

        int count = 1;
        for (int i = 1; i < arrStr.length; i++) {
            if (arrStr[i].equals(arrStr[i - 1])) {
                count++;
                if (i == arrStr.length - 1) {
                    System.out.println(arrStr[i-1] + " - " + count);
                }
            } else if (count > 1) {
                System.out.println(arrStr[i-1] + " - " + count);
                count = 1;
            }
        }
    }
}


