package com.swati;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Target;
import java.util.Properties;

@Author ("Swati Palkar")
public class ProperyDemo {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.name"));

       @Author
        Properties ps = new Properties();
        try {
            ps.load(ProperyDemo.class.getResourceAsStream("app.properties"));
            System.out.println("DB Name: " + ps.getProperty("db.name"));
            ps.setProperty("Owner Name", "Swati");
            ps.store(new FileOutputStream("app.properties"), "Added new properties");



        } catch (IOException ex) {
            System.out.println("Unable to read properties");
        }
    }
}
