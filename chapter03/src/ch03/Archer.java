package ch03;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
	}

	public void frieArrow() {
		System.out.println("불화살공격을 합니다.");
	}

	@Override
	protected void attack() {
		// super.attack();
		System.out.println(super.name + " 기본공격을 합니다.");
	}
} // end of class
