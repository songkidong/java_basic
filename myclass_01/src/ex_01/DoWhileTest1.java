package ex_01;

import java.util.Scanner;

public class DoWhileTest1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int userInput;
	
	do {
		System.out.println("==============");
		System.out.println("투표를 진행해주세요.");
		System.out.println("1번은 찬성, 0번은 포기");
		userInput = sc.nextInt();
	} while(userInput !=0);
	
	
	
	
	
	
} // end of main

		
	
	
} // end of class
