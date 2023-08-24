package com.tenco.books;

import java.util.Scanner;

import ch09.Book;

/**
 * @author 송기동 책을 관리하는 프로그램 C R U D 기능을 구현해보자
 */
public class TencoBooks {

	public static void main(String[] args) {
		// 삭제는 null
		// 준비물
		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[100];
		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_TITLE = "3";
		final String DELETE_ALL = "4";
		final String UPDATE = "5";
		final String AND = "0";

		boolean flag = true;
		// 마지막에 저장된 인덱스 번호를 기억해두자
		int lastIndexNumber = 0;

		// todo(앞으로 해야 할 일) 샘플 데이터 주후 삭제
		books[0] = new Book("홍길동전", "허균");
		books[1] = new Book("사피엔스", "유발하라리");
		lastIndexNumber = 2;

		while (flag) {
			// while 사용하자
			System.out.println("** 메뉴 선택 **");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 5.수정 0.종료");
			System.out.println("------------------------------------");
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals("0")) {
				flag = false;

			} else if (selectedNumber.equals(SAVE)) {
				lastIndexNumber = save(sc, books, lastIndexNumber);

			} else if (selectedNumber.equals(SEARCH_ALL)) {
				searchAll(books);

			} else if (selectedNumber.equals(SEARCH_TITLE)) {
				searchTitle(sc, books);

			} else if (selectedNumber.equals(DELETE_ALL)) {

				deleteAll(sc, books);

			} else if (selectedNumber.equals(UPDATE)) {

				update(sc, books);

			} else {
				System.out.println("잘못 입력했습니다. 다시 선택하세요.");
			}

		} // end of while
		System.out.println("프로그램 종료");
	} // end of main

	// 저장하는 기능 static 메서드로 만들어보기
	public static int save(Scanner scanner, Book[] books, int index) {
		// 사용자에게 입력값을 받아야 한다.
		System.out.println(">> 저장하기 <<");
		System.out.println("책 제목을 입력하세요");
		String bookTitle = scanner.nextLine();
		System.out.println("저자 이름을 입력하세요");
		String bookAuthor = scanner.nextLine();
		Book book = new Book(bookTitle, bookAuthor);
		books[index] = book;
		index++;
		System.out.println(bookTitle + " 책을 생성 했습니다.");
		return index;
	} // end of save

	// 전체 조회
	public static void searchAll(Book[] books) {
		System.out.println(">> 전체 조회하기 <<");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i].showInfo();
				System.out.println("--------------");
			}
		}
	} // end of searchAll

	// 선택조회 - 책 제목으로 검색하기
	public static void searchTitle(Scanner scanner, Book[] books) {
		System.out.println(">> 선택 조회하기 <<");
		System.out.println("책 제목을 입력하세요");
		String bookTitle = scanner.nextLine();

		for (int i = 0; i < books.length; i++) {

			if (books[i] != null) { // 방어적 코드 작성

				// "홍길동전".equals(사용자가 입력한 값.)
				if (books[i].getTitle().equals(bookTitle)) {

					// 같은 책 제목이 존재한다 ! <- true
					books[i].showInfo();
					break; // 여기서는 선택조회라 데이터를 찾았다면 굳이 모든 반복문을 동작 시킬 필요가 없음

				}
			}
		}

	} // end of searchTitle

	// 전체삭제
	public static void deleteAll(Scanner scanner, Book[] books) {
		System.out.println(">> 전체 삭제하기 <<");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i].setTitle(null);
				books[i].setAuthor(null);
				books[i].showInfo();
			}
		}
	} // end of deleteAll

	// 수정하기
	public static void update(Scanner scanner, Book[] books) {
		System.out.println(">> 수정하기 <<");
		System.out.println("수정할 책 제목을 입력하세요");
		String bookUpdate = scanner.nextLine();

		// 수정 --
		/// 검색한 녀셕이 어디에 존재하는가??? books[??] 몇번째 인덱스인지 알아야 한다.
		// 0 <---
		// 책
		// book[0] = new (); -- 1

		// book[0].setTitle(""); -- 2
		// book[0].setAuthor("") -- 2

		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				if (books[i].getTitle().equals(bookUpdate)) {
					books[i].showInfo();
					System.out.println("책 제목을 수정해주세요");
					String bookTitle = scanner.nextLine();
					books[i].setTitle(bookTitle);
					System.out.println("저자 이름을 수정해주세요");
					String bookAuthor = scanner.nextLine();
					books[i].setAuthor(bookAuthor);

					System.out.println(bookTitle + " 으로 책을 수정 했습니다.");
					System.out.println("===============================");

					books[i].getTitle().equals(bookTitle);

					// 같은 책 제목이 존재한다 ! <- true
					books[i].showInfo();
				}

			}
		}

	} // end of update

} // end of class
