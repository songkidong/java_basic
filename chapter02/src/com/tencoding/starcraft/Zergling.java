package com.tencoding.starcraft;

public class Zergling {
	private String name;
	private int power;
	private int hp;

	public Zergling(String name) {
		this.name = name;
		this.power = 2;
		this.hp = 45;
	}

	// getter 메서드 만들기
	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 질럿 공격
	public void attackZealot(Zealot targetZealot) {
		targetZealot.beAttacked(power);
		System.out.println(this.name + " (이)가 " + targetZealot.getName() + "를 공격합니다");
	}

	// 마린 공격
	public void attackMarine(Marine targetMarine) {
		targetMarine.beAttacked(power);
		System.out.println(this.name + " (이)가 " + targetMarine.getName() + "를 공격합니다");
	}

	// 자신이 공격을 당하다.
	public void beAttacked(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + " 이미 사망 하였습니다 ");
			return; // 실행에 제어권을 반환 한다.
		}
		this.hp -= power;
	}

	public void showInfo() {
		System.out.println("== 상태 창 == ");
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);
	}
}