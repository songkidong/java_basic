package StarCraft;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		
	
		while(true) {
			System.out.println("-- 유닛을 선택하세요 --");
			System.out.println("1. 질럿 2. 마린 3. 저글링 4. 취소");
			String selectedNumber = sc.nextLine();
		
		if(selectedNumber.equals("4")) {
			flag = false;
		} else if(selectedNumber.equals("2")) {
			System.out.println("마린을 선택하셨습니다");
		} else if(selectedNumber.equals("3")) {
			System.out.println("저글링을 선택하셨습니다");
		} else if(selectedNumber.equals("4")) {
			System.out.println("취소하였습니다");
		}
		break;
		}
	} // end of main

} // end of class
