package ch03;

public class SubwayMainTest {

	public static void main(String[] args) {

		Subway subway1 = new Subway();
		subway1.subwayName = "연산";
		subway1.subwayWhere = "노포";

		int sum = 650;
		for (int i = 1; i < 101; i++) {
			sum *= i;
			subway1.take(650);
		}
		subway1.showInfo();
	} // end of main

} // end of class
