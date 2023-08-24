package ch03;

public class Subway {

	// 속성
	String subwayName;
	String subwayWhere;
	int count;
	int money;

	// 기능
	public void take(int m) {
		money += m;
		count = count + 1;
	}

	public void showInfo() {
		System.out.println("===== 상태창 =====");
		System.out.println(subwayName + " 역에 곧");
		System.out.println(subwayWhere + "행  지하철이 도착합니다.");
		System.out.println("승객 수는 :" + count + " 명 입니다.");
		System.out.println("수입금은 :" + money + " 원 입니다.");
	}

} // end of class
