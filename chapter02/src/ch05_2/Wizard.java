package ch05_2;

public class Wizard {

	String name;
	int power;
	int hp;

	public Wizard(String name) {
		this.name = name;
		this.power = 30;
		this.hp = 50;

	}

	public void attackWarrior(Warrior warrior) {
		warrior.beAttacked(this.power);
		System.out.println("마법사가 전사를 공격 합니다.");
	}

	public void attackArcher(Archer archer) {
		archer.beAttacked(this.power);
		System.out.println("마법사가 궁수를 공격 합니다.");
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
		System.out.println("마법사의 남은 체력은 " + hp + "입니다");
	}

} // end of class
