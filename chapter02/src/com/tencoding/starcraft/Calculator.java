package com.tencoding.starcraft;

public class Calculator {
	
	// 멤버 변수
	int sum = 0;
	
	// 두 정수를 더하는 static 메서드 만들기
	public static int add(int a, int b) {
		// 멤버 변수를 활용할 수 없는 이유는 뭘까?
		// sum = a+ b;
		return a + b;
	}

	// 두 정수를 빼는 static 메서드
	public static int subtract(int a, int b) {
		return a - b;
	}

	// 두 정수를 곱하는 static 메서드
	public static int muliply(int a, int b) {
		return a * b;
	}

	// 두 정수를 나누는 static 메서드
	public static int divide(int a, int b) {
		if (b == 0) {
			System.out.println("ERROR : Division by zero is not allowed.");
			return 0;
		}
		return a / b;
	}

	// 잠시 자리를 빌려서 static 함수를 작성할 수 있다.
	public static void main(String[] args) {

	}

} // end of class
