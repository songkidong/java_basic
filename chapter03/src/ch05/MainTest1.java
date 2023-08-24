package ch05;

public class MainTest1 {

	public static void main(String[] args) {

		Animal animal1 = new Animal();
		Tiger tiger1 = new Tiger();
		Human human1 = new Human();

		// 다형성을 적용
		Animal animal2 = new Tiger();
//		Animal animal3 = new Human();

		Animal[] arrayAnimals = new Animal[10];
		arrayAnimals[0] = tiger1;
		arrayAnimals[1] = animal1;

		// 여기까지는 컴파일 시점에서 확인되는 부분을 확인
		System.out.println("----------------------");
		tiger1.move();
		tiger1.eating();
	} // end of main

} // end of class
