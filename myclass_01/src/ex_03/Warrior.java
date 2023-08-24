package ex_03;

public class Warrior {

	String warriorName;
	int warriorHp;
	int warriorMp;
	int warriorDamage;
	int warriorArmor;

	public void attack() {
		System.out.println(warriorName + "이 공격합니다.");
	}

	public void defense() {
		System.out.println(warriorName + "이 방어합니다.");
	}

	public void showInfo() {
		System.out.println("---------- 능력치 ----------");
		System.out.println("닉네임 :" + warriorName);
		System.out.println(warriorName + "의 체력량은" + warriorHp + "입니다");
		System.out.println(warriorName + "의 마나량은" + warriorMp + "입니다");
		System.out.println(warriorName + "의 공격력은" + warriorDamage + "입니다");
		System.out.println(warriorName + "의 방어력은" + warriorArmor + "입니다");
		System.out.println("---------------------------------------");
	}
} // end of class
