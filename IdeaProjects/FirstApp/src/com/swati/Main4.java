package com.swati;

public class Main4 {

    public static void main(String args[]){


        Greet g = new Greet(); //Creating instance of "Greet" class
        g.greet("Swati");// Invoking greet() method

       //g.n = 100; //n exists as long as "g" exists!!!
    }// "g" is destroyed!!!
}
