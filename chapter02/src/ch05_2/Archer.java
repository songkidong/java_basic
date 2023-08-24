package ch05_2;

public class Archer {

	String name;
	int power;
	int hp;

	public Archer(String name) {
		this.name = name;
		this.power = 20;
		this.hp = 80;
	}

	public void attackWarrior(Warrior warrior) {
		// 전사를 공격합니다.
		warrior.beAttacked(this.power);
		System.out.println("궁수가 전사를 공격 합니다.");
	}

	public void attackWizard(Wizard wizard) {
		// 마법사를 공격합니다.
		wizard.beAttacked(this.power);
		System.out.println("궁수가 마법사를 공격 합니다.");
	}

	public void beAttacked(int power) {
		// 만약 hp가 0 이하라면
		if (this.hp <= 0) {
			System.out.println("이미 사망 !!!");
			this.hp = 0;
		} else {
			this.hp = this.hp - power;
		}

	}

	public void showInfo() {
		System.out.println("===== 상태창 =====");
		System.out.println("닉네임 :" + name);
		System.out.println("공격력 :" + power);
		System.out.println("체력 :" + hp);

	}

	public void showInfo2() {
		System.out.println("궁수의 남은 체력은 " + hp + "입니다");
	}

} // end of class
