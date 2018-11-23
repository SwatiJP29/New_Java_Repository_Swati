package com.swati;

public class Main3 {

    public static void main (String args[]){
        System.out.println("1st line in MAIN");
        drawLine();
        System.out.println("\n 2nd line in MAIN");
        drawLine(45);
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
