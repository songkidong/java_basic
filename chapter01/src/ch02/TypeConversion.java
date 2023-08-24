package ch02;

public class TypeConversion {
	// 코드의 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 형 변환 : 데이터 타일을 변환 하는 것을 말한다.
		// 1. 강제 형 변환
		// 2. 자동 형 변환

		int iNumber1 = 100;
		System.out.println(iNumber1);

		double dNumber1;

		dNumber1 = iNumber1; // 자동 형 변환 이라고 한다.
		System.out.println(dNumber1);

		System.out.println("----------");

		double dNumber2 = 1.12345;
		int iNumber2 = (int) dNumber2;
		// 강제 형 변환 - 원래는 오류가 발생 되자만 컴파일러한테 괜찮아 그냥 넣어, 버려지는거 무시
		System.out.println(iNumber2);

		// 연습
		double a;
		int b;

		// 1. a의 값(리터럴)으로 0.5를 담아보세요
		a = 0.5;
		// 2. b의 값을 10.5를 담아보세요
		b = (int) 10.5;
		// 3. b를 화면에 출력해 보세요
		System.out.println(b);
		
	} // end of main

} // end of class
