package ch03;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	public void comboAttack() {
		System.out.println(super.name + " 2단공격을 합니다.");
	}

	@Override
	protected void attack() {
		// super.attack();
		System.out.println(super.name + " 기본공격을 합니다.");
	}

} // end of class
