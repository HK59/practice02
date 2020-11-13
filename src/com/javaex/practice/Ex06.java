package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요.");
		System.out.print("숫자1:  ");
		int num01 = sc.nextInt();
		System.out.print("숫자2:  ");
		int num02 = sc.nextInt();
		
		if(num01>num02 ) {
			System.out.println("큰수: "+ num01);
			System.out.println("작은수: "+ num02);
		}else if(num01<num02){
			System.out.println("큰수: "+ num02);
			System.out.println("작은수: "+ num01);
		}
		
		sc.close();
	}

}


