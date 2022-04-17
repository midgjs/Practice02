package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int x = sc.nextInt();
		double answer;
		
		if(x<=0) {
			answer = x*x*x - 9*x + 2;
		} else {
			answer = 7*x +2;
		}
		
		System.out.println("계산결과는 " + answer + " 입니다.");
		
		sc.close();
		
	}

}
