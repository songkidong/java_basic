package ch05_2;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("전사");
		Archer archer1 = new Archer("궁수");
		Wizard wizard1 = new Wizard("마법사");

		// warrior1.attackArcher(archer1);
		// archer1.attackWarrior(warrior1);
		// wizard1.attackWarrior(warrior1);

		// 궁수에 상태값을 확인해 보자.
		archer1.showInfo();
		warrior1.showInfo();
		wizard1.showInfo();

		Scanner num = new Scanner(System.in);
		int input = 1;
		System.out.println("누구를 생성하겠습니까?");
		while (input != 0) {
			System.out.println("1. 전사" + " 2. 궁수" + " 3. 마법사" + " 4. 생성취소");
			input = num.nextInt();
			if (input == 1) {
				System.out.println("전사를 생성하였습니다.");
				System.out.println("누구를 공격하시겠습니까 ?");
				System.out.println("1. 궁수, 2. 마법사");
				int a = num.nextInt();
				if (a == 1) {
					System.out.println("궁수를 공격.");
					warrior1.attackArcher(archer1);
					archer1.showInfo2();
				} else if (a == 2) {
					System.out.println("마법사를 공격.");
					warrior1.attackWizard(wizard1);
					wizard1.showInfo2();
				}

			} else if (input == 2) {
				System.out.println("궁수를 생성하였습니다.");
				System.out.println("누구를 공격하시겠습니까 ?");
				System.out.println("1. 전사, 2. 마법사");
				int b = num.nextInt();
				if (b == 1) {
					System.out.println("전사를 공격.");
					archer1.attackWarrior(warrior1);
					warrior1.showInfo2();
				} else if (b == 2) {
					System.out.println("마법사를 공격.");
					archer1.attackWizard(wizard1);
					wizard1.showInfo2();
				}

			} else if (input == 3) {
				System.out.println("마법사를 생성하였습니다.");
				System.out.println("누구를 공격하시겠습니까 ?");
				System.out.println("1. 전사, 2. 궁수");
				int c = num.nextInt();
				if (c == 1) {
					System.out.println("전사를 공격.");
					wizard1.attackWarrior(warrior1);
					warrior1.showInfo2();
				} else if (c == 2) {
					System.out.println("궁수를 공격.");
					wizard1.attackArcher(archer1);
					archer1.showInfo2();
				}
			} else if (input == 4) {
				System.out.println("생성을 취소하였습니다");
			}
			break;
		}
		System.out.println("공격이 종료 됩니다.");

	} // end of main

} // end of class
