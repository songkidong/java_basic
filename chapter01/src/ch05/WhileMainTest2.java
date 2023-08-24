package ch05;

import java.util.Scanner;

public class WhileMainTest2 {
	// 메인 함수 - 메인쓰래드(작업자)
	public static void main(String[] args) {

		// 사용자가 입력한 숫자 start 값 받아주세요
		// 사용자가 입력한 숫자 end 값을 받아주세요
		// 결과를 출력하는 프로그램 만들어 주세요
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("start 값을 입력해주세요.");
		int num = sc.nextInt();
		System.out.println("end 값을 입력해주세요.");
		int end = sc.nextInt();

		while (num <= end) {
			sum = sum + num;
			// 반드시 종료 되는 조건 식을 추가해서 무한 반복을 조심하자
			num++;
		} // end of while
		System.out.println("합산의 결과 값은 :" + sum + " 입니다.");
	} // end of main

} // end of class
