package com.swati;

public class MainInterestCalculator {
    public static void main(String[] args) {
        try {
            ExceptionHandling1.cal(230, 3.5, 5);
        } catch (Exception ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        }
    }
}
