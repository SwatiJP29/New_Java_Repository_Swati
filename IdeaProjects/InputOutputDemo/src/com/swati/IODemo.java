package com.swati;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo {

    public static void main(String[] args) {
        String name = null;

        //buffered manually
       /* byte[] buffer = new byte[100];
        int size = System.in.read(buffer);
        name = new String(buffer, 0, size);*/

        try{
            System.out.println("Enter your name ");
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(reader);
            name = br.readLine();

            System.out.println("Hello "+name);
            br.close();

        } catch (IOException e) {
            System.out.println("Unable to read ");

        }
    }
}
