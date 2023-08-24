package com.tencoding.starcraft;

/**
 * 
 * 1. 이름 짓는 방법 - 메서드는 무조건 소문자로 먼저 시작하세요 - 변수명은 무조건 소문자 단어간에 연결된 단어 --> 카멜기법 사용자
 * - 클래스와 생성자는 무조건 대문자 시작하기
 * 
 * 
 * -- 기능을 만드다는 것은 미리 머리속에 어떤 일을 할것이가를 명확히 하고 -- 코딩을 작성해야 한다.
 * 
 * 변수를 자세하게 구분지어 부른때 기준 -> 메모리 위치 기준으로 불러 보자 stack - 지역 변수 heap - 멤버 변수
 * static(데이터영역) - static 변수
 * 
 * 
 * 2단계 static 메모리안에 만들어지는 공간 -> 값이 들어간다 객체들간에 공유할 수 있다.
 * 
 * VS 객체안에 멤버 변수는 자기만에 값을 가진다.
 * 
 */

public class GateWay {

	private static int zealotCount = 0;

	private int myZealotCount = 0;

	// 질럿을 생산합니다.
	public Zealot createZealot() {
		zealotCount++;
		myZealotCount++;
		return new Zealot("질럿");
	}
	// 드라군을 생산합니다.
	// public Dragon createDragon() {
	// return new Dragon("드라군");
	// }

	// 전체 게이트웨이에서 생성된 질럿 수 보기 기능
	public static void showZelaotCount() {
		// 1. zealotCount <---
		System.out.println("전체 게이트 웨이가 생성한 질럿 카운트 " + zealotCount);
	}

	// 내가 직접 만든 질럿 수 보기 기능
	public void showMyZealotCount() {
		System.out.println("내가 직접 만든 질럿 수는 : " + myZealotCount);
	}

} // end of class
