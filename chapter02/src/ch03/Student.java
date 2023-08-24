package ch03;

public class Student {
	// 멤버 변수
	int studentId; // 기본 데이터 타입
	String studentName; // 참조 타입
	String adress;
	double weight;
	
	// 기능 정의

	public void study() {
		System.out.println(studentName +"이(가) 공부를 합니다.");
	}

	public void breaktime() {
		System.out.println(studentName + "이(가)학생이 휴식을 합니다.");
	}
	public void showInfo() {
		System.out.println("----- 상태창 -----");
		System.out.println(studentName + " 의 ID : " + studentId);
		System.out.println(studentName + " 의 name : " + studentName);
		System.out.println(studentName + " 의 주소 : " + adress);
		System.out.println(studentName + " 의 몸무게 : " + weight);
		System.out.println("----------------");
	}
	
		// 함수와 메서드의 차이점
		// 메서드는 멤버 변수를 활용해서 그 객체에 이름에 맞는 기능을 정의 하는 것이다.
		// 함수는 하나의 기능을 수행하는 일련에 코드 묶음이다.
} // end of class
