package logic;

public class CalUI {
    public static void main(String args[]){
        //c is a reference variable
        //'new' should instruct JVM to build new object of type 'Calculator' class
        Calculator c = new Calculator();
        Calculator d = c; // now c and d both referring same Object
        double p = c.doSum(12.99,99.1);
        System.out.println("Sum is "+p);
    }
}
