package ch04;

public class SubwayMainTest {

	public static void main(String[] args) {

		// 사용자 정의 생성자를 하나만 설꼐한다면
		// Subway를 인스턴스화 시키는 방법은 오직
		// 하나만 존재하게 된다.
		Subway subway1 = new Subway("서면역", 10.46, 1300);
		subway1.showInfo();

	} // end of main

} // end of class
