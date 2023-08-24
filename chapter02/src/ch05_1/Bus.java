package ch05_1;

public class Bus {

	// 상태
	int busNumber; // 버스 호선
	int count ; // 승객수
	int money; // 수익금
	
	// 생성자 - 버스 호선
	public Bus(int number) {
		this.busNumber = number;
	}
	
	// 기능
	// 승객을 태우다(버스요금)
	public void take(int money) {
		this.money += (1_300 * count);
	}
	// 승객을 하차시키다
	public void takeOff(int count) {
		this.count = count;
		if(this.count <= 0) {
			
		} else {
			System.out.println("하차 합니다.");
		}
	}
	
} // end of class
