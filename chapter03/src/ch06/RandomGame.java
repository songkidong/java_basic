package ch06;

import java.util.Random;

public class RandomGame {

	public static void main(String[] args) {

		Random random = new Random();
		// 0 1 2
		int selected = random.nextInt(3);
		String[] strings = new String[3];
		strings[0] = "곰인형";
		strings[1] = "아이폰";
		strings[2] = "라이터";
		System.out.println(strings[selected]);
	}

}
