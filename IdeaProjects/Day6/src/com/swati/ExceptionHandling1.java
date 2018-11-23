package com.swati;

public class ExceptionHandling1 {
    static void cal(double p, double r, int d) throws InvalidPrincipalException, InvalidRateException, InvalidDurationException{
        if(p<InvalidPrincipalException.MIN_PRINCIPAL || p>InvalidPrincipalException.MAX_PRINCIPAL)
            throw new InvalidPrincipalException();
        if(r<InvalidRateException.MIN_RATE || r>InvalidRateException.MAX_RATE)
            throw new InvalidRateException();
        if(d<InvalidDurationException.MIN_DURATION|| d>InvalidDurationException.MAX_DURATION)
            throw new InvalidDurationException();

        double interest = (p*r/100*d)/100;
        System.out.println("Interest is: "+interest);
    }
}
