package ch05;

public class WhileMainTest {
	// 메인 함수 - 메인쓰래드(작업자)
	public static void main(String[] args) {

		// while(조건식) {수행구문}
		// 1부터 10까지 덧셈하는 연산을 while 문으로 만들어 보자.
		int start = 1;
		int sum = 0;

//		sum = start +1;
//		sum = start +2; ... 10

		// 무한 반복을 조심 하자!!!
		while (start < 11) {
			sum = sum + start;
			System.out.println(start);
			start++;
			System.out.println("한번 수행 완료");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of while
		System.out.println("----------------");
		System.out.println("sum" + sum);
	} // end of main

} // end of class
