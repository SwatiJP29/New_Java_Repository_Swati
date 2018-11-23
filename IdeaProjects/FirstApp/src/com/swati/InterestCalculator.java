package com.swati;

public class InterestCalculator {
    protected double principal;
    protected double rate;
    protected double duration;

   public InterestCalculator(double principal, double rate, double duration){
        this.principal = principal;
        this.rate = rate;
        this.duration = duration;
    }

    public double calculate(float principal, float rate, float duration) {
        return (principal * rate * duration) / 100;
    }

    /*public double getPrincipal(){
        return principal;
    }

    public double getRate(){
        return rate;
    }

    public double getDuration(){
        return duration;
    }*/
}
