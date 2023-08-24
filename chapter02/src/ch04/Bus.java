package ch04;

public class Bus {
	// 속성(상태)
	int busNumber;
	int count;
	int money;
	
	double weight;
	// 생성자 만들어 보기
	// 생성자는 리턴 타입이 없다. 메서드와 구분하세요!
	// 반드시 클래스 이름과 동일 해야 한다.

	// 1. - 기본 생성자는 컴퍼일러가 자동으로 만들어 준다.
	// 단 !! (사용자 정의 생성자가 없을 경우)
	public Bus() {

	}

	// 개발자가 직접 생성자를 명시하는 것을
	// 사용자 정의 생성자라고 부른다.
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public Bus(double count) {
		
	}
	public Bus(int busNumber, int count) {
		this.busNumber = busNumber;
		this.count = count;
	}

	public Bus(int busNumber, int count, int money) {
		this.busNumber = busNumber;
		this.count = count;
		this.money = money;
	}
	// 행위(기능)
	public void take(int m) {
		money += m;
		count++;
	}

	public void showInfo() {
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("승객 수 : " + count);
		System.out.println("금액 : " + money);
		System.out.println("==================");
	}
} // end of class
