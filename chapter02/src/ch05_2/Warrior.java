package ch05_2;

// 클래스를 설계한 쪽
public class Warrior {

	// 참조 타입
	String name;
	// 기본 데이터 타입
	int power;
	int hp;

	public Warrior(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
	}

	public void attackArcher(Archer archer) {
		// archer 주소값을 넘겨 받은 상태이다.
		archer.beAttacked(this.power);
		System.out.println("전사가 궁수를 공격 합니다.");
	}

	public void attackWizard(Wizard wizard) {
		// 마법사를 공격 함
		wizard.beAttacked(this.power);
		System.out.println("전사가 마법사를 공격 합니다.");
	}

	public void beAttacked(int power) {
		// 내가 공격을 받다
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
		System.out.println("전사의 남은 체력은 " + hp + "입니다");

	}
} // end of class
