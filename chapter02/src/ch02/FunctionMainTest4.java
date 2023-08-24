package ch02;

public class FunctionMainTest4 {

	public static void main(String[] args) {

		// 함수를 호출해서 실행하시오
		int sum1 = division(100, 4);
		System.out.println(sum1);

		int sum2 = multiply(2, 10);
		System.out.println(sum2);

		int sum3 = remainder(10, 3);
		System.out.println(sum3);

	} // end of main

	// 함수 3개를 선언 하시오.
	public static int division(int div1, int div2) {
		int result = div1 / div2;
		return result;
	}

	public static int multiply(int mul1, int mul2) {
		int result = mul1 * mul2;
		return result;
	}

	public static int remainder(int rem1, int rem2) {
		int result = rem1 % rem2;
		return result;
	}
} // end of class
