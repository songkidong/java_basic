package ex_06;

public class Car {

	private String carName = "우르스";
	private String makerName = "람보르기니";
	private int carNumber = 7777; 
	private int price = 270000000;

	// 생성자
	public Car() {

	}

	public Car(int price) {

	}

	public Car(String carName, String makerName, int carNumber, int price) {

	}

	// get 메서드
	public String getCarName() {
		return carName;
	}

	public String getMakerName() {
		return makerName;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public int getPrice() {
		return price;
	}

	// set 메서드
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 기능
	public void carShowInfo() {
		System.out.println("==== 차량 정보 조회 ====");
		System.out.println("차 이름 : " + carName);
		System.out.println("제조사 : " + makerName);
		System.out.println("차 번호 : " + carNumber);
		System.out.println("가격 : " + price);

	}
} // end of class
