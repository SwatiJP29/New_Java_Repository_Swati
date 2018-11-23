package com.swati;

import java.sql.SQLOutput;

public class SwitchExample {
    public static void main(String [] args){
        int numOfAngle = 3;

        switch (numOfAngle){
            case 3:
                System.out.println("triangle");
                break;
            case 4:
                System.out.println("rectangle");
                break;
            case 5:
                System.out.println("pentagon");
                break;
             default:
                System.out.println("Unknown shape");
                 break;
        }
    }
}
