package ch03;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
	}

	public void freezing() {
		System.out.println("얼음공격을 합니다.");
	}

	@Override
	protected void attack() {
		// super.attack();
		System.out.println(super.name + " 기본공격을 합니다.");
	}

} // end of class
