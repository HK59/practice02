package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("성인이십니까?");
		System.out.print("나이:");
		
		int age = sc.nextInt();
		
		if (age<18) {
			
			System.out.println("청소년 입니다. ");
		}
		
		
		sc.close();
	}

}
