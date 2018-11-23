package com.swati;

public interface FlyableInterfacedemo {

    int speed = 100;//public, final and static
    // defalut methods were introduced in Java-8
    default void fly(){//ABSTRACT and public
        System.out.println("Defalut Fly");
    }

    public static void navigate(){
        System.out.println("Static Navigation");
    }
}
