package com.javaex.ex05;

public class Mul {

	static private int a;
	static private int b;
    
    public static void setValue(int a, int b) {
    	Mul.a = a;
    	Mul.b = b;
    }

    public static int calculate() {
    	return a*b;
    }

}
