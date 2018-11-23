package com.swati;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scanner.nextLine();
        System.out.println("Enter Age");
        int a = scanner.nextInt();

        System.out.println("Hello "+name+" you are "+a);
    }
}
