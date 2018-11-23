package com.swati;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int k = 100/0;
            int data[] = new int [1];
            data [2] = k;
            System.out.println("Answer: "+ k);
        }catch(RuntimeException ex){
            System.out.println("Input is invalid "+ex.getCause());
        }
        //catch(ArithmeticException ex){
            //System.out.println(ex.getMessage());
       // }catch (ArrayIndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
        //}
        System.out.println("End of Main");

    }
}
