package ch09;

public class ArrayMainTest2 {

	public static void main(String[] args) {
 
		// 변수는 크게 몇가지가 존재한다고 하였나요?
		// 기본데이터 타입, 참조 타입
		
		char[] ch1 = new char[10]; // <-- 기본데이터 타입(연관된 데이터)
		ch1[0] = 'H'; 
		ch1[1] = 'E'; 
		ch1[2] = 'L'; 
		ch1[3] = 'L'; 
		ch1[4] = 'O'; 
		System.out.println(ch1[4]);
				
		String[] strings = new String[5];
		strings[0] = "안녕반가워";
		strings[1] = "안녕반가워";
		strings[2] = "안녕반가워";
		System.out.println(strings[0]);
	} // end of main

} // end of class
