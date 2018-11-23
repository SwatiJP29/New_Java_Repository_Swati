package com.swati;

public class InvalidRateException extends Exception {
    public static final double MIN_RATE = 4;
    public static final double MAX_RATE = 25;
    InvalidRateException(){
        super("Rate is invalid, it should be between the range "+MIN_RATE+" to"+MAX_RATE);
    }
}
