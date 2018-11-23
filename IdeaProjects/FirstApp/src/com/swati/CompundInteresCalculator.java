package com.swati;
 import com.swati.InterestCalculator;
public class CompundInteresCalculator extends InterestCalculator {

    //Constructor chaining
    public CompundInteresCalculator(double principal, double rate, double duration){
        super(principal, rate,duration);
    }

    public double calculate(){

        /*double P = super.principal;
        double R = super.rate;
        double T = super.duration;*/
        return (principal*Math.pow((1+rate)/100, duration));
    }

}
0