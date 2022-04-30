package com.javaex.ex05;

public class Sub {

	static private int a;
	static private int b;
    
    public static void setValue(int a, int b) {
    	Sub.a = a;
    	Sub.b = b;
    }

    public static int calculate() {
    	return a-b;
    }

}
