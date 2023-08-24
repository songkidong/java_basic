package ch05;

import java.util.Random;

import java.util.Scanner;

public class GuessingNumberGame2 {

	public static void main(String[] args) {

		// 랜덤 도구 사용
		// 스캐너 도구 사용

		// 1. 랜덤 숫자 발생 1 부터 5 까지 하나 생성
		// 2. 사용자에 키보드 입력 값을 받아 주세요
		// 3. 만약 랜덤 숫자와 사용자 입력 값이 맞으면 성공
		// 4. 기회는 3번만 주어 집니다.

		Random random = new Random();
		int resultRandom = random.nextInt(5) + 1;
		Scanner sc = new Scanner(System.in);
		int input = 1;
		int chance = 2;
		while (true) { // input 값이 0이 아니라면 true 결과가 나온다 1
			System.out.println("번호를 입력하세요");
			input = sc.nextInt();
			if (input == resultRandom) {
				System.out.println("정답");
				break;
			}
			if (input != resultRandom) {
				System.out.println("실패 기회가 " + chance + " 회 남았습니다.");
				chance--;
			}
			if (chance == -1) {
				System.out.println("종료");
				break;
			} // end of while

		} // end of main
	}
}
// end of class
