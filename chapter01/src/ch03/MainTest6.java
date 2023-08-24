package ch03;

public class MainTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 관계 연산자 ( 비교 연산자 )
		// 관찰에 결과가 참, 거짓을 판별할 때 사용한다.
		// 결과는 오직 true, false 로 반환이 된다.

		boolean value1 = 5 > 3;
		boolean value2 = 5 < 3;
		boolean value3 = 5 == 1;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

		boolean value4;
		int num1 = 10;
		int num2 = 50;

		value4 = num1 < num2;
		System.out.println(value4);
		value4 = num1 > num2;
		System.out.println(value4);

		// 문제 직접 만들어 보기 2문제 작성 결과 출력
		// 1. 철수는 500원이 있고 미나는 1000원이 있습니다. 철수가 더 돈을 많이 가지고 있나요?
		int chulsoo = 500;
		int mina = 1000;
		boolean value5 = chulsoo > mina;
		System.out.println(value5);
		// 2. 월드컵에서 a가 5골을 넣고 c도 5골을 넣었습니다. 둘은 공동 득점왕인가요?
		int a = 5;
		int b = 5;
		boolean value6 = a == b;
		System.out.println(value6);

	} // end of main

} // end of class
