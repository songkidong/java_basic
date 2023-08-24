package ch05;

import StarCraft.Marine;
import StarCraft.Unit;
import StarCraft.Zealot;
import StarCraft.Zergling;

public class MainTest2 {

	public static void main(String[] args) {

		// Unit 이라는 배열에 저글링, 질럿, 마린을 담아 보세요
		// 실행도 시켜 봅시다.

		Unit unit1 = new Zealot("질럿");
		Unit unit2 = new Marine("마린");
		Unit unit3 = new Zergling("저글링");

		Unit[] arrayUnits = new Unit[5];
		arrayUnits[0] = unit1;
		arrayUnits[1] = unit2;
		arrayUnits[2] = unit3;

		unit1.showInfo();
		unit2.showInfo();
		unit3.showInfo();
	} // end of main

} // end of class
