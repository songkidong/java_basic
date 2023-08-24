package ch06;

public class BankMainTest {

	// 메인 함수
	public static void main(String[] args) {

		Bank bank = new Bank();
		// System.out.println(bank.balance);
		// bank.showInfo();
		// System.out.println(bank.showInfo()); <-- 오류 발생

		bank.deposit(10_000);
		bank.withdraw(15_000);
		bank.withdraw(5_000);
		bank.showInfo();

		// 신입이 실수를 한 코드
		// bank.balance = 100_000; <-- private 추가
		bank.deposit(100_000);

	} // end of main

} // end of class
