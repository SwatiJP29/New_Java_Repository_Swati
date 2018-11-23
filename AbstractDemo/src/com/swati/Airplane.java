package com.swati;

public class Airplane implements FlyableInterfacedemo {

    public void fly(){ //this method would be called when fly method is called as this is defined in the class
        System.out.println("Airplane fly");


        /*public void fly1(){ //If we do not have the method fly mentioned below then the method mentioned in the interface id called.
            System.out.println("Airplane fly");*/
    }

    public static void main(String[] args) {
        Airplane plane = new Airplane();
        plane.fly();

        FlyableInterfacedemo.navigate();
    }
}
