package ch09;

public class ArrayMainTest {

	public static void main(String[] args) {

		// 배열 이란
		// **연관된 데이터를 모아서 통으로 관리하기 위해 사용하는 데이터 타입니다.**
		// 사용하는 방법
		int[] arr1; // 변수에 선언(데이터타입이 int가 아니라 int 배열입니다.)
		arr1 = new int[2]; // 배열의 초기화는 반드시 크기가 먼저 지정해주어야 사용 가능하다.)
		// 배열의 크기도 생각을 해보자

		double[] arr2 = new double[2]; // 선언과 동시에 초기화

		// 값을 넣는 방법
		arr1[0] = 100;
		arr1[1] = 1000;
		// 인덱스의 순서는 0번부터 시작한다.

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);

		// 주의 : 배열의 길이(크기)와 인덱스의 번호는 다르다.
		// 공식 --> 배열의 인덱스의 번호는 n-1
		// System.out.println(arr1[2]); <-- 오류발생

		arr2[0] = 10.0;
		arr2[1] = 20.0;
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
	} // end of main

} // end of class
