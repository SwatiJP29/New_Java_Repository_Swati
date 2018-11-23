package com.swati;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int intVar = 65;
        char charVal = '\u0041';
        intVar = charVal;
        System.out.println("Char in INT:"+intVar);

        int n = 22/7; // Loss of Precision
        System.out.println("n = "+n);

        float f = 22/7; //loss of precision
        System.out.println("f ="+f);

        float f1 = (float)22 /7;
        System.out.println("f1 ="+f1);

        double d = (float) 22/7.0;
        System.out.println("d ="+d);


    }
}
