package com.swati;

public class InvalidPrincipalException extends Exception {
    public static final double MIN_PRINCIPAL = 10000;
    public static final double MAX_PRINCIPAL = 100000000;
    InvalidPrincipalException(){
        super("Invalid Principal amount, must be in the range "+InvalidPrincipalException.MIN_PRINCIPAL);

    }
}
