package com.company.lesson_2;

public class Main {

    public static void main(String[] args) {
        System.out.println("____________________11111_________________________________");
        //task #1 ddd
        int[] nums = {1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0};
        nums = func1(nums);
        for (int i = 0; i < nums.length; i++) System.out.println(nums[i]);
        //________________________________________________________________________
        System.out.println("____________________22222_________________________________");
        //task #2
        func2();
        //________________________________________________________________________
        System.out.println("____________________33333_________________________________");
        //task #3
        int[] intArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        intArr = func3(intArr);
        for (int i = 0; i < intArr.length; i++) System.out.println(intArr[i]);
        //________________________________________________________________________
        System.out.println("____________________44444_________________________________");
        //task #4
        int[][] bigArr = new int[5][5];
        bigArr = func4(bigArr);
        String strLine = "";
        for (int j = 0; j < bigArr.length; j++){
            for (int i = 0; i < bigArr.length; i++) {
                strLine = strLine + bigArr[i][j] + " ";
            }
            System.out.println(strLine);
            strLine="";
        }
        //________________________________________________________________________
        System.out.println("____________________55555_________________________________");
        //task #5
        int[] arrMax = {10, 3, 66, 250};
        System.out.println("Максимальное значение массива: " + func51(arrMax));
        System.out.println("Минимальное значение массива: " + func52(arrMax));
        //________________________________________________________________________
        System.out.println("____________________66666_________________________________");
        //task #6
        int[] arrSum = {1, 1, 1, 2, 1};
        System.out.println(func6(arrSum));
        //________________________________________________________________________
        System.out.println("____________________77777_________________________________");
        //task #7
        int[] arrSum1 = {1, 2, 3, 4, 5};
        arrSum1 = reverseArray(arrSum1, 4);
        for (int i = 0; i < arrSum1.length; i++) System.out.println(arrSum1[i]);

    }

    public static int[] func1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = 1;
            else nums[i] = 0;
        }
        return nums;
    }
    public static void func2() {
        int[] numArr = new int[8];
        for (int i = 0; i < numArr.length-1; i++) numArr[i+1] = numArr[i] + 3;
        for (int i = 0; i < numArr.length; i++) System.out.println(numArr[i]);
    }
    public static int[] func3(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) nums[i] = nums[i] * 2;
        }
        return nums;
    }
    public static int[][] func4 (int[][] nums) {
        for (int i = 0; i < nums.length; i++) nums[i][i] = 1;
        for (int i = 0; i < nums.length; i++) nums[i][nums.length - i - 1] = 1;
        return nums;
    }
    public static int func51 (int[] nums){
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (maxValue < nums[i]) maxValue = nums[i];
        }
        return maxValue;
    }
    public static int func52 (int[] nums){
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (minValue > nums[i]) minValue = nums[i];
        }
        return minValue;
    }
    public static boolean func6 (int[] nums){
        boolean result = false;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j <= i; j++) {
                sumLeft = sumLeft + nums[j];
            }
            for (int k = i+1; k < nums.length; k++) {
                sumRight = sumRight + nums[k];
            }
            if (sumLeft == sumRight) {result = true; break;}
            sumLeft = 0;
            sumRight = 0;

        }
        return result;
    }
    public static int[] reverseArray (int[] array, int n){
        int temp;
        if (n == 0) {

        } else if (n > 0) {
            for (int j = 1; j <= n; j++){
                temp = array[array.length-1];
                for (int i = array.length-1; i > 0; i--){
                    array[i] = array[i-1];
                }
                array[0] = temp;
            }
        } else if (n < 0) {
            for (int j = 1; j <= n* (-1); j++){
                temp = array[0];
                for (int i = 0; i < array.length-1; i++){
                    array[i] = array[i+1];
                }
                array[array.length-1] = temp;
            }
        }
        return array;
    }

}
