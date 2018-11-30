package com.jp.dp;

public class TestSingleton {
	public static void main(String[] args){
		Singleton01 s1 = Singleton01.getInstance();
		Singleton01 s2 = Singleton01.getInstance();
		Singleton01 s3 = Singleton01.getInstance();
	}

}
