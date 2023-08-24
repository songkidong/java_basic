package ch08;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("AI가 자율 주행을 합니다.");
		System.out.println("스스로 방향을 변경합니다.");
	}

	@Override
	public void stop() {
		System.out.println("AI가 스스로 차을 멈춥니다.");
	}

	// run() 메서는 final 키워들 사용했기때문에 재정의 불가능 !

}