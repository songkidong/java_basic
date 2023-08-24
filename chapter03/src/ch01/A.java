package ch01;

public class A {

	String name;
	int height;
	int weight;
	int age;

	public static void main(String[] args) {
		C c1 = new C();
		c1.age = 10;
		System.out.println(c1.age);
	} // end of main
} // end of class A

// 하나의 .java 파일안에서 여러개의 클래스를 설계할 수 있다.
// 단. 하나의 자바 파일에서 접근제어 지시자 public class는 단 하나만 설계 가능하다.
class B {

	String name;
	int height;
	int weight;
	int age;
	String tel;
} // end of class B

class C extends A {

	String phone;

	// 메인 함수 테스트 - 잠시 자리만 빌림
} // end of class C