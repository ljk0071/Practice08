package com.javaex.ex05;

public class Div{

    static private int a;
    static private int b;
    
    public static void setValue(int a, int b) {
    	Div.a = a;
    	Div.b = b;
    }

    public static int calculate() {
    	return a/b;
    }

}
