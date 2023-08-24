package ch02;

public class FunctionMainTest {

	// 함수란?
	// 두개에 매개 변수를 받아서 덧셈 하는 기능을 만들기

	// 함수를 선언하는 문법
	public static int addNubmer(int n1, int n2) {

		// 결과를 담을 변수를 선언
		int result;
		result = n1 + n2;
		return result;

	}

	public static double minusNumber(int n1, int n2) {

		int result;
		result = n1 - n2;
		return result;

	}

	public static void main(String[] args) {

		int returnValue = addNubmer(10, 5); // 함수를 호출하는 문법
		System.out.println(returnValue);

		int returnValue2 = addNubmer(100, 9900);
		System.out.println(returnValue2);

		// 함수 호출은 모양 맞추기 이다.
		double returnValue3 = minusNumber(5, 100);
		System.out.println(returnValue3);
	} // end of main

} // end of class
