package ch03;

public class StudentMainTest1 {

	public static void main(String[] args) {

		Student studentKim = new Student();
		studentKim.studentId = 1;
		studentKim.studentName = "티모";
		studentKim.adress = "블루진영";
		studentKim.weight = 65.8;

		studentKim.study();
		studentKim.breaktime();
		studentKim.showInfo();

		Student studentLee = new Student();
		studentLee.studentId = 2;
		studentLee.studentName = "야스오";
		studentLee.adress = "레드진영";
		studentLee.weight = 90.2;

		studentLee.showInfo();
		// 멤버 변수는 값을 초기화 하지 않으면 기본값으로
		// 컴파일러가 값을 넣어서 만들어 준다.

	} // end of main

} // end of class
