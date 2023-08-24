package ch05;

public class Bus {

	// ** 속성 **
	int busNumber; // 버스 호선
	int count; // 승객 수
	int money; // 수익금

	// ** 생성자 **
	public Bus(int number) {
		this.busNumber = number;
	}

	// ** 기능 **
	// 달린다.
	// 승차 시키다.
	// 하차 시키다.
	// 정보창을 보여주다.
	public void run() {
		System.out.println("버스가 출발 합니다.");
	}

	// 승차 시키다.
	public void take(int count) {
		// this.count = count +count;
		this.count += count;
		// this.money = this.money + 1_300;
		this.money += (1_300 * count);
	}

	// 하차 시키다.
	public void takeOff(int count) {
		// 만약 0명이라면 -를 해서는 안된다.
		if (this.count <= 0) { // 방어적 코드 작성
			System.out.println(" 잘못 입력 하였습니다.");
		} else {
			this.count -= count;
			System.out.println(count + " 명의 승객이 내립니다.");
		}

	}

	public void showInfo() {
		System.out.println("===== 상태창 =====");
		System.out.println("버스 번호 :" + this.busNumber);
		System.out.println("승객 수 :" + this.count);
		System.out.println("수익 금 :" + this.money);
	}
} // end of class
