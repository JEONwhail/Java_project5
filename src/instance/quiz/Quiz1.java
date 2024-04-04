package instance.quiz;

/* 다음과 같이 사람클래스(Person)를 정의하세요.
 * 이름, 나이, 결혼여부, 자식수를 속성으로 갖습니다.
 *    
 * 그리고 Person 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
 * 이름: James
 * 나이: 40세
 * 결혼여부: o
 * 자식: 3
 * */
public class Quiz1 {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.name = "James";
		System.out.println("이름 :" + person.name);
		
		person.age = 40;
		System.out.println("나이 :" + person.age);
		
		person.isMarried = true;
		System.out.println("결혼 여부 :" + person.isMarried);
		
		person.numberChildren = 3;
		System.out.println("자녀 수 :" + person.numberChildren);
	}
}

class Person {
	String name; // 문자열
	int age;  // 정수
	boolean isMarried; // 참 거짓 
	int numberChildren; // 자식 수 = 정수
}
