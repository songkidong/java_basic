package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수를 활용해서 연산을 한다고 실제 변수안에 들어가 있는 값이 변경 되는 것은 아니다.
		char myA = 'A';
		char yourA = 'a';
		System.out.println((int) myA);
		System.out.println((double) myA);
		System.out.println("-------------------");
		System.out.println(myA);
		System.out.println("-------------------");
		// 즉, 값을 변경 하려면 대입 연산자를 활용할 수 있다.
		myA = 'B';
		System.out.println(myA);

		// 대입 연산자에 우선 순위는 가장 낮다.
		// 연산에 방향은 반드시 오른쪽에서 왼쪽으로 간다고 생각하자.
		// <------------

	} // end of main

} // end of class
