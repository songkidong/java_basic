package ch02;

public class ConstantTest {
	// 코드의 시작점 - 메인함수
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 ! = 상수 (상수는 변하지 않는 수)
		// 예약이 (미리 선정해 놓은 단어) - final 키워드를 사용해서 상수라고 지정한다.
		// 권장 사항 - 상수를 사용할 때는 대문자를 쓰고 연결의 단어는 _를 사용해서 연결한다.
		final int MAX_NUM = 12;
		// 상수란 : 한 번 초기화 된 값은 변경할 수 없다.
		System.out.println(MAX_NUM);
		// MAX_NUM = 100; <-- 변경 불가능

		final int MIN_NUM;
		MIN_NUM = 500;
		// MIN_NUM = 20000; <-- 불가능 한번 초기화 완료 했기 때문에
		System.out.println(MAX_NUM);
		System.out.println(MAX_NUM);
		System.out.println(MAX_NUM);
		// ctrl + alt + 방향키 아래 = 열 복사

		// L value = R value
		int count = 500; // 리터럴 이라고 부른다.
	} // end of main

}// end of class
