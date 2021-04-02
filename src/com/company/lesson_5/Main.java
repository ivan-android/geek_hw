package com.company.lesson_5;


import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван", "Инжинер", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Петров Петр", "Тестировщик", "petrov@mailbox.com", "892312312", 30000, 41);
        employees[2] = new Employee("Гринев Лев", "Программист", "grinev@mailbox.com", "892312312", 30000, 45);
        employees[3] = new Employee("Сидорова Анна", "Аналитик", "sidorov@mailbox.com", "892312312", 30000, 29);
        employees[4] = new Employee("Бажуков Игорь", "Девопс", "bajukov@mailbox.com", "892312312", 30000, 50);

        for(Employee empl: employees){
            if(empl.getAge() > 40) System.out.println(empl.getFullInfo());
        }
    }


}


