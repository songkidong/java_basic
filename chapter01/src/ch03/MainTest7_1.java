package ch03;

public class MainTest7_1 {

	// 메인 쓰레드(작업자1)
	public static void main(String[] args) {

		// 논리 연산자(논리 곱, 논리 합)

		int num1 = 5;
		int i = 0;

		boolean value = ((num1 = 1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1); // 11
		System.out.println(i); // 앞에서 F가 나왔기 때문에 뒤에는 계산을 안함.

		boolean value2 = ((num1 = num1 + 1) > 0) || ((i = 100) < 2000);
		System.out.println(value2);
		
		// 부정 연산자 ---> !
		// value2 = true
		System.out.println(!value2);
		System.out.println(value2);
	} // end of main

} // end of class
