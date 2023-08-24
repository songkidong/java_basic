package ch05;

import java.util.Scanner;

public class ContinueMainTest {

	public static void main(String[] args) {

		// 1부터 10까지 화면에 결과를 출력하시오
		// 만약 3의 배수라면 화면에 값을 출력 하지 마시오
		int j;
		for (j = 1; j <= 10; j++) {

			if (j % 3 == 0) {
				continue;
			} // end of if
			System.out.println("j :" + j);
		} // end of for
		
		Scanner scanner = new Scanner(System.in);
		

		// 배수에 개수를 출력 해주세요
		// System.out.println();
		int i;
		int count = 0;
		final int A = 5;
		int start = 1;
		int end = 1000;
		
		for (i = start; i <= end; i++) {
			if (i % A == 0) {
				count = count + 1;
				continue;
			} // end of if
		} // end of for
		System.out.println(A + "의 배수는" + count + "개 입니다.");
	} // end of main

} // end of class
