package com.swati;

import com.swati.InterestCalculator;
public class Main5 {
    public static void main(String[] args) {
        InterestCalculator a = new InterestCalculator(100, 5, 4);
        /*double Amount = a.calculate(100, 5, 4);*/
        System.out.println("Simple Interest is "+a.calculate(100, 5, 4));

        CompundInteresCalculator CI = new CompundInteresCalculator(100780,5,4);
        System.out.println("Compund Interest is "+CI.calculate());

    }
    // as the main method is not static it will not run the below code.
    public  void main() {
        InterestCalculator a = new InterestCalculator(100, 5, 4);
        /*double Amount = a.calculate(100, 5, 4);*/
        System.out.println("Simple Interest is " + a.calculate(100, 5, 4));

        CompundInteresCalculator CI = new CompundInteresCalculator(100780, 5, 4);
        System.out.println("Compund Interest is " + CI.calculate());
    }
}

