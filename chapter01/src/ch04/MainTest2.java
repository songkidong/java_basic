package ch04;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		// 문제 1
		Scanner sc = new Scanner(System.in); // 스캐너 도구 준비 완료
		// 1. 스캐너를 사용해서 성적을 입력 받아 주세요
		System.out.println("성적을 입력해주세요.");
		int score = sc.nextInt(); // R value -> 정수값을 키보드에서 입력 받는다.
		// 2. 만약 90점 이상이면 A 출력
		if (score >= 90) {
			System.out.println(" A ");
		} else if (score >= 80) {
			// 3. 만약 80점 이상이면 B 출력
			System.out.println(" B ");
		} else if (score >= 70) {
			// 4. 만약 70점 이상이면 C 출력
			System.out.println(" C ");
		} else {
			System.out.println(" F ");
		}
		// 5. 만약 70점 이하면 F 출력
		
		
	} // end of main

} // end of class
