package instance.quiz;

/* 
 * 다음과 같이 도서 클래스(Book)를 정의하세요.
 * 제목, 가격, 출판사, 페이지수를 멤버변수로 속성으로 갖습니다.
 *    
 * 그리고 Book 클래스를 사용하여 다음 정보를 가지는 두 개의 인스턴스를 생성하세요.
 * (자바프로그래밍, 20000, 한빛컴퍼니, 300)
 * (스프링, 15000, 한빛컴퍼니, 500)
 * 모든 인스턴스의 정보와 메모리 주소를 출력하세요.
 * */
public class Quiz3 {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "자바프로그래밍";
		book1.price = 20000;
		book1.company = "한빛컴퍼니";
		book1.page = 300;
		book1.showInfo();
		System.out.println("인스턴스 주소 :" + book1);
		System.out.println();
		
		Book book2 = new Book();
		book2.title = "스프링";
		book2.price = 15000;
		book2.company = "한빛컴퍼니";
		book2.page = 500;
		book2.showInfo();
		System.out.println("인스턴스 주소 :" + book2);
		System.out.println();

		Book book3 = new Book();
		book3.title = "테스트";
		book3.price = 150000000;
		book3.company = "그린컴퍼니";
		book3.page = 500000;
		book3.showInfo();
		System.out.println("인스턴스 주소 :" + book3);
		System.out.println();
		
		Book book4 = new Book();
		book4.title = "테스트02";
		book4.price = 150;
		book4.company = "컴퓨터컴퍼니";
		book4.page = 50;
		book4.showInfo();
		System.out.println("인스턴스 주소 :" + book4);
		System.out.println();

		
	}
}

class Book {
	String title; 
	int price; 
	String company; 
	int page;
	
	public void showInfo() {
		System.out.println("제목:" + title + ", 가격:" + price + ", 출판사: " + company + ", 페이지:" + page);
	}
}
