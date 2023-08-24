package ch08;

public class SchoolNumber {

	private String name;
	private static int studentNumber = 20230001;

	public SchoolNumber(String name) {
		this.name = name;

	}

	// 학번 출력
	public void PrintSchoolNumber() {
		System.out.println(name + "의 학번은" + studentNumber + "입니다.");
		studentNumber++;
	}
} // end of class
