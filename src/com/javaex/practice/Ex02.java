package com.javaex.practice;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("X는 무엇입니까?");
		System.out.print("숫자: ");
		int x = sc.nextInt();
		
		//x가 0과 같으면
		
		switch(x) {
		case 0:
			System.out.println("X는 0이다.");
			break;
		}
		
		sc.close();
	}

}
