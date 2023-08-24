package ch06;

public class Bank {

	// 정보 은닉
	// 접근 제어 지시자 private - 자기 자신에서만 사용 가능
	private String name; // 계좌 번호
	private int balance; // 계좌 잔액

	// 입금
	public void deposit(int money) {
		this.balance += money;
		System.out.println(money + " 원이 입금되었습니다.");
		System.out.println("잔액은 " + balance + " 원 입니다.");
	}

	// 출금 - 도전 (잔액이 0원인데 출금 요청)
	public int withdraw(int money) {
		// 메서드 영역 안에 사용하는 변수는 지역 변수라고도 한다.
		System.out.println(money + " 원을 출금합니다.");
		int result = 0;
		if (this.balance < money) { // 잔액 금액보다 요청 금액이 크다
			System.out.println("잔액이 부족합니다");
			result = 0;
		} else {
			this.balance -= money;
			result = money;
		}
		return result;

	}

	// 잔액 확인
	public void showInfo() {
		System.out.println("현재 계좌 잔액은" + balance + " 입니다");
	}
} // end of class
