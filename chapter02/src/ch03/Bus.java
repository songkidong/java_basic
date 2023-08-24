package ch03;

public class Bus {

	// 속성
	int busNumber;
	int count;
	int money; // 수익금

	// 기능
	public void take(int m) {
		// 0 = 0 +1300; ...1300
		// 1300 = 1300 + 1300 ... 2600
		// money = money + m;
		money += m;
		count = count + 1;
	}

	public void showInfo() {
		System.out.println("==== 상태창 ====");
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("승객 수 :" + count);
		System.out.println("현재 수익금 :" + money);

	}

} // end of class
