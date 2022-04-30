package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	String[] nArray;
    	String str;
    	int a=0;
    	int[] num = new int[3];
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.print(">> ");
    		str = sc.nextLine();
        	nArray = str.split(" ");
        	for(int i=0;i<nArray.length;i++) {
        		try {
            		a = Integer.valueOf(nArray[i]);
            		num[i] = a;
            	}catch (NumberFormatException e) {
            	}
        	}
    		if (str.equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}else if ( str.contains("-")) {
    			Sub.setValue(num[0], num[2]);
    			System.out.print(">> " + Sub.calculate() + "\n");
    		}else if ( str.contains("/")) {
    			Div.setValue(num[0], num[2]);
    			System.out.print(">> " + Div.calculate()+ "\n");
    		}else if ( str.contains("*")) {
    			Mul.setValue(num[0],  num[2]);
    			System.out.print(">> " + Mul.calculate()+ "\n");
    		}else if ( str.contains("+") ) {
    			Add.setValue(num[0], num[2]);
    			System.out.print(">> " + Add.calculate()+ "\n");
    		}else {
    			System.out.println("알 수 없는 연산입니다.");
    		}
    	}
    	sc.close();
    }
}
