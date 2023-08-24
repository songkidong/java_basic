package ch02;

public class TypeConversionTest {
	// 코드의 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 형 변환에 관련한 문제를 직접 만들어 보기
		double a;
		int b;
		long c;
		// 1. a의 값으로 6.1234567890을 담아보세요
		a = 6.1234567890;
				System.out.println(a);
		// 2. b의 값으로 6.12를 담아보세요
		b =(int)6.12;
		// 3. b를 화면에 출력해 보세요
		System.out.println(b);
		// 4. c의 값으로 10000000000을 담아보세요
		c = (long)100000000000L;
		// 5. c를 화면에 출력해 보세요
		System.out.println(c);
		
	} // end of main

} // end of class
