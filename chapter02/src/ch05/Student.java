package ch05;

public class Student {

	String name; // 이름
	int money; // 용돈

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 학생이 버스를 탄다.
	public void takeBus(Bus bus) {
		// bus 버스에 주소값을 전달 받을 수 있다.
		// count (승객 수) 는 1로 넣는다.
		bus.take(1);
		// 여기서 버스를 탔다라는 의미는 내 용돈에서 돈을 지불
		this.money -= 1_300;
	}
	// 학생이 버스를 내린다.
	
	// 학생이 지하철을 탄다.
	
} // end of class
