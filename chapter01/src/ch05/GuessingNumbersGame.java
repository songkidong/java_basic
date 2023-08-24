package ch05;

import java.util.Random;

public class GuessingNumbersGame {

	public static void main(String[] args) {

		// 스캐너
		// Random
		Random random = new Random();
		int resultRandom = random.nextInt(45) + 1; // 난수(랜덤 정수값을 하나 반환해준다.)
		// (45)라고 괄호안에 숫자를 넣으면 0부터 44까지 랜덤 숫자를 하나 만들어 준다.
		System.out.println(resultRandom);
		

	} // end of main

} // end of class
