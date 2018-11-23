package com.swati;

public class InvalidDurationException extends Exception {
    public static final int MIN_DURATION = 12;
    public static final int MAX_DURATION = 12;

    InvalidDurationException(){
        super("Duration is invalid, the duration should be between "+MIN_DURATION+" to"+MAX_DURATION);
    }
}
