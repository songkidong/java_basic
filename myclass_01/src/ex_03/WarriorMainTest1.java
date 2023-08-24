package ex_03;

public class WarriorMainTest1 {

	public static void main(String[] args) {

		Warrior warriorA = new Warrior();
		warriorA.warriorName = "A";
		warriorA.warriorHp = 500;
		warriorA.warriorMp = 100;
		warriorA.warriorDamage = 150;
		warriorA.warriorArmor = 50;

		warriorA.attack();
		warriorA.defense();
		warriorA.showInfo();

		Warrior warriorB = new Warrior();
		warriorB.warriorName = "B";
		warriorB.warriorHp = 1000;
		warriorB.warriorMp = 500;
		warriorB.warriorDamage = 300;
		warriorB.warriorArmor = 100;
		warriorB.showInfo();

	}

}
