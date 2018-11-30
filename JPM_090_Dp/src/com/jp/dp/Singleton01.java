package com.jp.dp;

/*Declare self reference as static and private
 * Create private constructor
 * step3. A static public method to be created restricted number of instances.
 */

public class Singleton01 {
	private static Singleton01 singleton;
	
	private Singleton01 (){    //As this constructor is private so we cannot create an object using new Singleton() in any other class.
		System.out.println("Constructor executed.");
	}
	
	public static Singleton01 getInstance(){
		if (singleton==null){
			singleton = new Singleton01();
		}
		
		return singleton;
	}

}
