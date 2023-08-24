package ch03;

public class BusMainTest {

	public static void main(String[] args) {

		Bus bus100 = new Bus();
		Bus bus200 = new Bus();
		// System.out.println(bus100);
		bus200.busNumber = 200;
		// bus200.take(1300); // 사람 1
		// bus200.take(1300); // 사람 2
		// 반복문 활용
		int sum = 1300;
		for (int i = 1; i < 101; i++) {
			sum *= i;
			bus200.take(1300);
		}
		bus200.showInfo();
	} // end of main

} // end of class
