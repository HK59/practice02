package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키:  ");
		int height = sc.nextInt();
		System.out.print("몸무게:  ");
		int weight = sc.nextInt();
		
		if(weight>(height-100)*0.9) {
			System.out.println("과체중 입니다.");
		}else if (weight<(height-100)*0.9) {
			System.out.println("저체중 입니다.");
		}else {
			System.out.println("정상 입니다.");}
			
		System.out.print("표준체중"+(height-100)*0.9);
		
		
		sc.close();
		}

	}
	
