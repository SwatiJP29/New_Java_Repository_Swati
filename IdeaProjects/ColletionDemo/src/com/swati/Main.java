package com.swati;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List data = new ArrayList();
        data.add(100);
        data.add(34);
        data.add(54);
        data.add("Swati");
        data.add(12.55);
        data.add("Swati");

        Iterator it = data.iterator();
        System.out.println("Displaying ALL elements from List");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Set data2 = new HashSet();
        data2.addAll(data);

        System.out.println("Displaying data in SET");
        Iterator it2 = data2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }


    }
}
