package ch03;

public class MainTest7 {

	public static void main(String[] args) {
		// 핵심정리
		// 논리 연산자 (&&,||) 엠퍼센트, 버티컬 바
		// 관계 연산자와 혼합하여 많이 사용한다.
		// 연산에 결과는 true, false로 반환 된다.
		// 논리 곱(&&)은 모든 결과값이 참이여야 참이 나온다. treu
		// 하나라도 거짓이 나오면 무조건 거짓이 나온다. false
		int num1 = 10;
		int num2 = 20;
		
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);
		
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);
		
		boolean flag3 = (num1 < 0) && (num2 < 0);
		System.out.println(flag3);
		
		// 결론
		// 논리 곱에서 하나라도 거짓이 있으면 연산에 결과는 false 이다.
		
		System.out.println("============================");
		
		// 논리 합(||)
		// 논리 합에서는 하나라도 참이 있으면 연산에 결과는 true 이다.
		flag1 = (num1 < 0) || (num2 > 0);
		System.out.println(flag1);
		// flag2 = T || T = true
		// flag3 = T || F = true
		// flag4 = F || F = false
	} // end of main

} // end of class
