package com.swati;

public class Main2 {

    public static void main(String args[]) {

        int num = 13;
        boolean isPrime = true;

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + "is prime!");
        } else {
            System.out.println(num + "is not prime");
        }
    }


    static void drawLine() {
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }

    }

    static void drawLine(int width){
        for (int i=0;i<width;i++){
            System.out.println("-");
        }
    }
}