package ch01;

public class Variable {

	// <-- 주석 - 컴파일러가 무시 하는 코드
	// 1. 자바에서 중괄호(블록)에 범위는 절대적이다.

	// main 이란 : 프로그램의 시작 점
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// **변수를 사용하는 방법**
		int age; // 문장의 끝은 세미콜론(;)을 통해서 컴파일러에게 알려 주어야 한다.
		int count; // <-- 변수 선언 - 메모리 공간만 일단 할당 해둔 상태!!

		age = 1; // 초기화 한다(값을 넣다)
		// age2 = 10; 메모리 공간을 할당 해야 사용할 수 있다. age2 공간은 없는상태
		count = 100; // 100으로 초기화

		// 화면에 xxx를 출력하라 !
		System.out.println(age); // 개발자 도구에서 만들어 둔 명령어
		// 단축키 ctrl +f11 (실행)
		System.out.println(count);

		// 변수란 메모리 공간도 의미 하지만 변하는 수 이기도 하다.
		age = 500;
		// int age; 먼저 할당한 변수 이름을 똑같이 하나 더 만들 수 없다. (공간 할당 의미)

		System.out.println(age);

		// 변수의 선언과 초기화 (한번에 사용)
		int myAge = 30;
		System.out.println(myAge);
		System.out.println("=========");
		// 화면에 바로 숫자도 입력, 문자도 바로 입력 할 수 있다.
		System.out.println(700);
		System.out.println("문자열");

	} // end of main

} // end of class
