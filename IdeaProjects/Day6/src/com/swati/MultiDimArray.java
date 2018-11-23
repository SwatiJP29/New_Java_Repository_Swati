package com.swati;

public class MultiDimArray {
    public static void main(String[] args) {
        int data[][] = new int[4][3];
        //Create First ROW
        data [0] = new int []{55, 47, 47};
        //Create Second Row
        data [1] = new int []{55, 47, 45};
        //Create Third Row
        data [2] = new int []{55, 41, 45};
        //Create Forth Row
        data [3] = new int []{55, 40, 45};

        //Calculate and print SUM of each ROW
        for (int row=0; row<data.length; row++){
            int sum=0;
            for (int col=0; col<data[row].length; col++){
                sum += data[row][col];
            }
            System.out.println("Sum of row is "+sum);
        }
    }
}
