package com.company.lesson_14;




import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 1};
        boolean res = isContainOneOrFour(arr);
        System.out.println(res);



    }

    public static int[] getArrayAfter4(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                count = i;
            }
        }
        if (count > 0 && count != array.length - 1) {
            return Arrays.copyOfRange(array, count + 1, array.length);
        } else if (count == array.length - 1) {
            return new int[1];
        } else if (count == 0) {
            throw new RuntimeException("В массиве нет 4!");
        }
        return null;
    }

    public static boolean isContainOneOrFour(int[] array) {
        boolean resultBoolean;
        int countOne = 0;
        int countFour = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 4) {
                return false;
            }
            if (array[i] == 4) {
                countFour++;
            } else if (array[i] == 1) {
                countOne++;
            }
        }
        if (countFour == 0 || countOne == 0) {
            resultBoolean = false;
        } else {
            resultBoolean = true;
        }
        return resultBoolean;
    }

}



