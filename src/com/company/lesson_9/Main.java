package com.company.lesson_9;



public class Main {

    public static void main(String[] args) {
        String[][] arrr = {{"1", "2", "3", "5"},
                {"1", "2", "3", "5"},
                {"1", "2", "3", "5h"},
                {"1", "2", "3", "5"}};
        try{
            System.out.println(sumElementsOfArray(arrr));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }

    }

    public static int sumElementsOfArray(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        if(arr.length != 4 || arr[0].length != 4){
            throw new MyArraySizeException("Массив не того размера!");
        }
        int sumResult = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sumResult = sumResult + Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("Ошибка парсинга ячейки [" +i+ "][" + j + "]");
                }
            }
        }
        return sumResult;
    }


}


