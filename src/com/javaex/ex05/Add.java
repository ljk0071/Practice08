package com.javaex.ex05;

public class Add {
    
    static private int a;
    static private int b;
    
    public static void setValue(int a, int b) {
    	Add.a = a;
    	Add.b = b;
    }

    public static int calculate() {
    	return a+b;
    }

}
