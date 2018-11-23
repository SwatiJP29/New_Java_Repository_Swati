package com.swati;

import java.io.*;
import java.util.Properties;

public class JDBCProperty {
    public static void main(String[] args) {
        try{
            Properties jdbc = new Properties();
            jdbc.load(JDBCProperty.class.getResourceAsStream("jdbc.properties"));
            jdbc.setProperty("db.driver", "oracle.jdbc.OracleDriver");
            jdbc.setProperty("db.name", "xe");
            jdbc.setProperty("db.user", "hr");
            jdbc.setProperty("db.password", "hr");
            jdbc.setProperty("db.url", "jdbc:oracle:thin:@localhost:1527/xe");

            jdbc.store(new FileOutputStream("jdbc.properties"), "Added DB Connectivity details" );

        }catch (IOException ex){
            System.out.println("Unable to load properties");
        }

    }
}
