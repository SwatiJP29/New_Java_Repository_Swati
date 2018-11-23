package com.swati;

public class ForLoop {
    public static void main(String[] args) {
        int nums[] = {10,20,30,40};

        for (int i=0;i<nums.length;i++){
            System.out.println("Num :" +nums[i]);
        }

        System.out.println("Enhance For /For Each Loop");
        //Get ONE Value of type INT from array "nums"
        //LOOP terminates after last nums
        for (int x :nums){
            System.out.println("Num :" +x);
        }
    }
}
