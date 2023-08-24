package ch01;

public class DataType2 {
	// 코드의 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수에 선언
		char name; // 2byte 공간에 하나의 문자를 담아 둘 수 있다.
		char a;
		char initial;

		// 값을 넣다
		name = 'A'; // 홑 따옴표(')를 사용해야 한다. 하나의 문자만 담을 수 있다.
		// name = 'AB'; 불가능

		// 문제
		// 1. name 변수에 값을 화면에 출력 하시오
		System.out.println(name);
		// 2. 문자 H를 화면에 출력 하시오
		System.out.println('H');
		// 문자 b를 화면에 출력 하시오
		System.out.println('b');

	} // end of main

} // end of class
