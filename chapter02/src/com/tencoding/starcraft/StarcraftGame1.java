package com.tencoding.starcraft;

import java.util.Scanner;

public class StarcraftGame1 {

	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 4;

		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("발업질럿1");

		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("스팀팩마린1");

		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("발업저글링1");

		Scanner sc = new Scanner(System.in);
		int unitChoice = -1;

		// do while 활용하기
		do {
			System.out.println("유닛을 선택 하세요");
			System.out.println("1.질럿\t 2.마린\t 3.저글링\t 4.종료");
			unitChoice = sc.nextInt();

			if (unitChoice == ZEALOT) {
				System.out.println("질럿을 선택하셨습니다.");
				zealot1.showInfo();
				System.out.println("------------------");
				System.out.println("공격할 유닛을 선택하세요");
				System.out.println("2.마린 3.저글링");
				System.out.println("게임을 종료하고싶으시면 4.를 입력해주세요");
				System.out.println("------------------");
				int num1 = sc.nextInt();
				if (num1 == GAME_END) {
					System.out.println("게임을 종료합니다.");
					break;
				}
				System.out.println("몇 회 공격할지 숫자를 입력해주세요");
				int num2 = sc.nextInt();
				if (num1 == MARINE) {
					for (int i = 0; i < num2; i++) {
						zealot1.attackMarine(marine1);
					}
					marine1.showInfo();
				} else if (num1 == ZERGLING) {
					for (int i = 0; i < num2; i++) {
						zealot1.attackZergling(zergling1);
						zergling1.showInfo();
					}
				}
			} else if (unitChoice == MARINE) {
				System.out.println("마린을 선택하셨습니다.");
				marine1.showInfo();

				System.out.println("------------------");
				System.out.println("공격할 유닛을 선택하세요");
				System.out.println("1.질럿 3.저글링");
				System.out.println("게임을 종료하고싶으시면 4.를 입력해주세요");
				System.out.println("------------------");
				int num1 = sc.nextInt();

				if (num1 == GAME_END) {
					System.out.println("게임을 종료합니다.");
					break;
				}
				System.out.println("몇 회 공격할지 숫자를 입력해주세요");
				int num2 = sc.nextInt();
				if (num1 == ZEALOT) {
					for (int i = 0; i < num2; i++) {
						marine1.attackZealot(zealot1);
						zealot1.showInfo();
					}
				} else if (num1 == ZERGLING) {
					for (int i = 0; i < num2; i++) {
						marine1.attackZergling(zergling1);
						zergling1.showInfo();
					}
				}

			} else if (unitChoice == ZERGLING) {
				System.out.println("저글링을 선택하셨습니다.");
				zealot1.showInfo();

				System.out.println("------------------");
				System.out.println("공격할 유닛을 선택하세요");
				System.out.println("1.질럿 3.저글링");
				System.out.println("게임을 종료하고싶으시면 4.를 입력해주세요");
				System.out.println("------------------");
				int num1 = sc.nextInt();
				if (num1 == GAME_END) {
					System.out.println("게임을 종료합니다.");
					break;
				}
				System.out.println("몇 회 공격할지 숫자를 입력해주세요");
				int num2 = sc.nextInt();
				if (num1 == ZEALOT) {
					for (int i = 0; i < num2; i++) {
						zergling1.attackZealot(zealot1);
						zealot1.showInfo();
					}
				} else if (num1 == MARINE) {
					for (int j = 0; j < num1; j++) {
						zergling1.attackMarine(marine1);
						marine1.showInfo();
					}
				}
			}

		} while (unitChoice == GAME_END);
		System.out.println("게임을 종료합니다.");
		System.out.println("------------------");
	}

}