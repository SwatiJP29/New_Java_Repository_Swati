package com.swati;

import logic.Account;
public class ObjectDemo {
    public static void main(String[] args) {
        int a = 100;
        Integer n = Integer.valueOf(100);
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = a1;

        System.out.println("Hashcode for a1: "+a1.hashCode());
        System.out.println("Hashcode for a2: "+a2.hashCode());
        System.out.println("Hashcode for a3: "+a3.hashCode());
        System.out.println("Hashcode for a1: "+a1.toString());
        System.out.println("Hashcode for a2: "+a2.toString());
        System.out.println("Hashcode for a3: "+a3.toString());
        System.out.println("Integer value for n: "+n);

        /*Long n = 10000000L;
        Byte b = (byte)10;
        Object o = n; //Upward Casting
        Long l = (long)o; //Downward Casting*/
    }

}
