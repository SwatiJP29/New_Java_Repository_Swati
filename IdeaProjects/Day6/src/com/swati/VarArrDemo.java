package com.swati;

import java.util.Arrays;

public class VarArrDemo {

    static int doSum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    static int doSum2(int... data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int []array = {10,20,30};
        int sum1 = doSum(array);
        int sum2 = doSum2(10,20,38,48,57,45);
        System.out.println("Sum1 is "+sum1);
        System.out.println("Sum2 is "+sum2);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
