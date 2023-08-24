package ch03_1;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
	}

	public void freezing() {
		System.out.println("얼음 공격을 합니다.");
	}

	@Override
	protected void attack() {
//		super.attack();
		System.out.println(super.name + " 기본 공격을 합니다.");
	}
} // end of class
