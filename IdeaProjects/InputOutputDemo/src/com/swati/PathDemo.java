package com.swati;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Iterator;

public class PathDemo {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("/users/swati");
        System.out.println(path);//Call toString
        System.out.println(path.toUri());

        Iterator it = FileSystems.getDefault().getRootDirectories().iterator();
        System.out.println("Root Directories (Drives in Windows)");
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
