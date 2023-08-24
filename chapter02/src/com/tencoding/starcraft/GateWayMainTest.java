package com.tencoding.starcraft;

import java.io.ObjectInputStream.GetField;

public class GateWayMainTest {

	public static void main(String[] args) {

		GateWay gateWay1 = new GateWay();
		GateWay gateWay2 = new GateWay();

		gateWay1.createZealot();
		gateWay1.createZealot();
		gateWay1.createZealot();
		gateWay1.showMyZealotCount();
		System.out.println("-------------------");
		gateWay2.createZealot();
		gateWay2.createZealot();
		gateWay2.showMyZealotCount();
		System.out.println("-------------------");
		// 전체 수를 보고 싶다면 (static 변수를 활용할 수 있다 - 인스턴스(객체)끼리 공유하는 데이터)
		GateWay.showZelaotCount();

		// 연습 문제
		// 게이트웨이 2개 이상 생성
		// 각각 질럿을 뽑아주세요
		// 최종 게이트웨이간에 뽑아낸 질럿 마리 수를 화면에 출력
	} // end of main

} // end of class
