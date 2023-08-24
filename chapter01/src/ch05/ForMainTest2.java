package ch05;

public class ForMainTest2 {

	public static void main(String[] args) {

		int num = 2;
		System.out.println(num + " * 1 =" + (num * 1));
		System.out.println(num + " * 2 =" + (num * 2));
		System.out.println(num + " * 3 =" + (num * 3));
		System.out.println(num + " * 4 =" + (num * 4));
		System.out.println(num + " * 5 =" + (num * 5));
		System.out.println(num + " * 6 =" + (num * 6));
		System.out.println(num + " * 7 =" + (num * 7));
		System.out.println(num + " * 8 =" + (num * 8));
		System.out.println(num + " * 9 =" + (num * 9));
		
		System.out.println("========================");
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + "=" + (num * i));
		}
		
		System.out.println("=========================");
		// 구구단 3단을 출력
		num = 3;
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + "=" + (num * i));
		}
		
		// 구구단 4단을 출력
		num = 4;
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + "=" + (num * i));
		}
		
	} // end of main

} // end of class
