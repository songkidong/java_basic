package ex_06;

public class Book {
	// 상태(속성)
	private String name;
	private String writer;
	private String publisher;
	private int price;

	// 생성자
	public Book() {

	}

	public Book(String name, String writer, String publisher, int price) {

	}

	// get 메서드
	public String getName() {
		return name;
	}

	public String getWriter() {
		return writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPrice() {
		return price;
	}

	// set 메서드
	public void setName(String name) {
		this.name = name;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPrice(int price) {
		if (price <= 0) {
			System.out.println("가격이 잘못되었습니다.");
			System.out.println("계산대에 문의해주세요.");
		} else {
			this.price = price;

		}
	}

	// 기능
	public void bookShowInfo() {
		System.out.println("==== 책 정보====");
		System.out.println("책 이름 : " + name);
		System.out.println("글쓴이 : " + writer);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);

	}
} // end of class
