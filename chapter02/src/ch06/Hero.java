package ch06;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private int level;
	private double defense;

	// 생성자
	public Hero(String name) {
		this.name = name;
	}

	// get, set 메서드는 무조건 설계 해주는 것이 아니라 필요하다면 사용하는 개념입니다.
	// getter, get 메서드 (리턴타입 반드시 존재)
	public int getPower() {
		return power;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getLevel() {
		return level;
	}

	public double getDefense() {
		return defense;
	}

	// setter, set 메서드 (리턴타입 없음, 매개변수 필요)
	public void setPower(int power) {
		// 방어적 코드를 작성한다.
		if (power <= 0) {
			System.out.println("잘못 입력 하였습니다.");
		} else {
			this.power = power;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		if (hp <= 0) {
			System.out.println("사망 하였습니다.");
		} else {
			this.hp = hp;
		}
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	// 기능
	public void attack() {
		System.out.println("공격을 합니다.");
	}

	public void beAttacked(int damage) {
		this.hp -= damage;
	}
} // end of class
