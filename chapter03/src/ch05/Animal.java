package ch05;

public class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void eating() {
		System.out.println("동물이 먹습니다.");
	}
} // end of Animal class

class Tiger extends Animal {

	@Override // 오버라이드
	public void move() {

		System.out.println("호랑이가 네발로 움직입니다.");
	}

	@Override
	public void eating() {
		System.out.println("호랑이가 사냥합니다.");
	}
} // end of Tiger class

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두발로 걸어다닙니다.");
	}

	@Override
	public void eating() {
		System.out.println("밥을 먹습니다.");
	}

	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
} // end of Human class
