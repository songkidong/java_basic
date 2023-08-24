package ch01;

public class Hero {

	String name;
	int hp;
	int mp;
	int damage;
	int defence;

	public static void main(String[] args) {
		Warrior warrior1 = new Warrior();
		Wizard wizard1 = new Wizard();
		Archer archer1 = new Archer();
		warrior1.name = "전사";
		wizard1.name = "궁수";
		archer1.name = "마법사";
		System.out.println(warrior1.name);
		System.out.println(wizard1.name);
		System.out.println(archer1.name);

	}
} // end of class

class Warrior extends Hero {

}

class Wizard extends Hero {

}

class Archer extends Hero {

}