package ch03;

public class MainTest5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 증감, 감소 - 모양 : 변수 기준으로 앞에 사용, 뒤에 사용 (오직 1을 더하거나 오직 1을 빼거나)

		// 1. 감소 연산자가 뒤에 올 경우
		int num1 = 100;
		num1--;
		int num2 = 1;
		int num3;

		num3 = num2--;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("=============");

		// 2. 감소 연산자가 앞에 올 경우
		int num20 = 100;
		int num21;

		num21 = --num20;
		System.out.println(num21);

	} // end of main

} // end of class
