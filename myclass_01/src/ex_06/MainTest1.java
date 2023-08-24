package ex_06;

public class MainTest1 {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.setName("홍길동전");
		book1.setWriter("허균");
		book1.setPublisher("좋은출판사");
		book1.setPrice(8_900);
		book1.bookShowInfo();

		Car car1 = new Car();
		String returnCarName = car1.getCarName();
		String returnMakerName = car1.getMakerName();
		int returnCarNumber = car1.getCarNumber();
		int returnPrice = car1.getPrice();
		car1.carShowInfo();

	} // end of main

} // end of class
