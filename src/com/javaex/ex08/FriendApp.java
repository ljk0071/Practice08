package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		String[] details;
		String friend;
		Friend[] fr = new Friend[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");
		for(int i=0;i<fr.length;i++) {
			friend = sc.nextLine();
			details = friend.split(" ");
			fr[i] = new Friend(details[0], details[1], details[2]);
			if ( i == fr.length-1 ) {
				for(int j=0;j<fr.length;j++) {
					fr[j].showInfo();
				}
			}
		}
		sc.close();
	}

}
