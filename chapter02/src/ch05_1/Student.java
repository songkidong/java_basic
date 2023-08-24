package ch05_1;

public class Student {

	//속성
	String name; // 학생의 이름
	int money; // 학생의 용돈
	//생성자 - 이름과 용돈을 받을수 있도록 설계
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 기능 
	// 학생이 버스를 탄다
	public void takeBus(Bus bus) {
		bus.take(1);
		this.money -= 1_300;
	}
	// 학생이 버스를 내리다
	public void takeOffBus(Bus bus) {
		bus.takeOff(1);
	}
	// 상태창 기능
	public void showInfo() {
		System.out.println("===== 상태창 =====");
		System.out.println("학생의 남은 용돈 : " + money);
		System.out.println("학생의 이름 : " + name);
		
	}
} // end of class
