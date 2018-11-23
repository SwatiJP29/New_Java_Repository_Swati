package com.swati;

import java.io.*;
import java.net.URI;

public class FileDemo {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\web");
            if (file.exists()){
                System.out.println("File Exists: ");
            }if (file.isDirectory()){
                System.out.println("Its a directory!!");
            }
            else {
                System.out.println("Its not a directory");
            }

            File newFile = new File(file, "Data1.txt");
            if (newFile.exists()){
                System.out.println("File Already exists");
            }else {
                System.out.println("New file is created");
                newFile.createNewFile();
                //newFile.deleteOnExit();
                URI uriFile = newFile.toURI();
                System.out.println("URI path is "+uriFile);


            }
        }catch(IOException ex){
            System.out.println("Unable to Create ");
        }
    }
}
