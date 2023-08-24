package ch05_1;

public class MainTest1 {

	public static void main(String[] args) {

		// 버스 객체 3개를 만들어 주세요
		Bus bus1 = new Bus(1);
		Bus bus2 = new Bus(2);
		Bus bus3 = new Bus(3);
		// 학생 객체 2개를 만들어 주세요
		Student studentKim = new Student("김민재", 30000);
		Student studentSon = new Student("손흥민", 50000);
		// 학생이 버스를 선택해서 승차 및 하차를 시켜 보세요
		studentKim.takeBus(bus2);
		studentKim.showInfo();

	} // end of main

} // end of class
