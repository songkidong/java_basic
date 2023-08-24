package ch03;

public class MainTest5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 증감, 감소 연산자
		// ++, --
		int num1 = 1;
		// ++num1;
		// num1++;
		// 변수에 접근해서 값을 오직 더하기 1 한다.
		System.out.println(num1);
		// num1을 2로 만드는 방법
		// 현재 num1 에는 1 이라는 값이 담겨져 있다.
		// num1 = 2;
		// num1 = num1 + 1;
		// num1 += 1;
		num1++;
		System.out.println(num1);
		// 주의 할 점 - 증감 연산자는 오직 1을 더해준다. 2도 X 3도 X 4도X

		// 감소 연산자
		int num2 = 1;
		// num2 라는 메모리 공간 안에 0 될 수 있는 코드 방식을 4가지로 다 작성해 보세요.
		// num2--;
		// num2 = 0;
		// num2 = num2 - 1;
		// num2 -= 1;
	} // end of main

} // end of class
