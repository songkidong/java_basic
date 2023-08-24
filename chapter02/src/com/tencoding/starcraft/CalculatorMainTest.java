package com.tencoding.starcraft;

public class CalculatorMainTest {

	public static void main(String[] args) {

		// 과제 - Calculator를 인스턴스화 시키지 말고
		// 동작들을 실행시켜서 확인해 보세요
		// 단 클래스 이름으로 접근해주세요
		int result1 = Calculator.add(2, 2);
		System.out.println(result1);
		int result2 = Calculator.muliply(4, 3);
		System.out.println(result2);
		int result3 = Calculator.divide(10, 0);
		System.out.println(result3);

	} // end of main

} // end of class
