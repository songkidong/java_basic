package ch06;

public class HeroMainTest {

	public static void main(String[] args) {

		Hero hero1 = new Hero("홍길동");
		hero1.setPower(100);
		int returnPower = hero1.getPower(); // 클래스 파일에 설정된 값이 나옴
		System.out.println(returnPower);
		
	} // end of main

} // end of class
