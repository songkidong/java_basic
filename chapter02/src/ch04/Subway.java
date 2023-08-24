package ch04;

public class Subway {

	// 1. 멤버 변수를 설계
	String subwayName;
	double subwayTime;
	int money;

	// 2. 생성자 2개 이상 설계
	public Subway() {

	}

	public Subway(String subwayName, double subwayTime) {
		this.subwayName = subwayName;
		this.subwayTime = subwayTime;
	}

	public Subway(String subwayName, double subwayTime, int money) {
		this.subwayName = subwayName;
		this.subwayTime = subwayTime;
		this.money = money;
	}
	// 3. 지하철에 맞는 메서드를 설계

	public void take(int m) {
		money += m;
	}

	public void showInfo() {
		System.out.println(subwayName + "에 " + subwayTime + " 분에 열차가 도착합니다.");
		System.out.println(" 요금은" + money + " 원 입니다.");
	}
} // end of class
