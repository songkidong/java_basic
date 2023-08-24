package ch01;

public class DataType1 {
	// 코드의 시작점
	public static void main(String[] args) {

		// 데이터 타입 종류는 크게 두가지가 있다.
		// 1. 기본 데이터 타입 (primitive type)
		// 2. 참조 타입 (Reference Type)
		// 기본 데이터 타입의 종류 - 정수형
		byte b; // 1byte
		short s; // 2byte
		int i; // 4byte
		long l; // 8byte

		b = 127;
		b = -128;

		// R벨류 기준으로 정수형 기본 4바이트로 받아 들인다.
		// 접미사를 작성해주어야 한다.
		// 정수형의 기본 연산 단위는 4바이트 이다.
		// long 단위를 작성을 할 때는 접미사를 넣어줘야 인식을 한다.
		l = 2100000000L; // L = long

		// 실수형을 표현할 때 사용하는 데이터 타입(float, double) - 기본 연산 단위 double 이다.

		double dou = 10.0; // <--변수의 선언과 초기화를 동시에 한 것
		float fot = 11.7F; // 역시나 접미사 F를 작성해야 한다.

		// 정수형 - int (4byte)
		// 실수형 - double (8byte)
		
	}// end of main

}// end of class
