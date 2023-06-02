package pse_0417;
// 객체:: 실생활에 존재하는 사물이나 실체 / 클래스로 인해 만들어진 것
// 클래스:: 객체를 만들어내는 "틀"

// 예제 :: 책 클래스
// class 클래스이름 {
//		멤버 나열
//}
class Book{
	// 멤버 변수
	//[접근제어자] [타입] [변수이름];
	// 접근제어 :: 멤버에 대한 접근을 제어하는 역할
	// public("어디에서든 자유롭게 접근이 가능하다.")
	//private("자신의 클래스 이외의 공간에서 접근을 불허한다.")
	private String name; // 책이름
	public String writer; // 저자 이름
	public String publish; // 출판사 
	public int year; //출간연도
	
	// getter, setter
	// this ::"이것", 호출당한 객체 자신을 지칭함
	public String getName() { // 함수를 호출한 객체의 name값 반환
		return name;
	}

	public void setName(String name) { // 함수를 호출한 객체의 name값을 매개변수를 받은 값으로 설정
		this.name = name;
	}

	//멤버 함수(메소드)
	// 모든 멤버 변수 값 출력하는 메소드 만들기
	public void Print() {
		System.out.println("책 이름: "+name);
		System.out.println("저자이름: "+writer);
		System.out.println("출판사이름: "+publish);
		System.out.println("출간연도: "+year);
	}

	// 생성자 :: 객체를 생성하는 것 (메소드 중 하나)
	// 생성자는 보통 멤버 변수들의 초기값을 설정하는 데에 사용됨 
	// 생성자가 별도로 없을 때에는. 클래슬르 선언할 시 자동으로 만들어지는 기본 생성자를 묵시적으로 사용함 
// class Book() {}	
	
	
	
	// 1. 구현하는 방식 (반환형(void)X)
	// 2. 호출하는 방식
	// 객체 생성시 자동으로 호출 
	
//	public 클래스이름 (매개변수타입 매개변수 이름, ...) {
//		생성자로 실행할 명령들
//	}
	
	//오버 로딩 :: 메소드의 이름은 같지만, 매개변수의 구성이 다를 경우 공존해서 사용할 수 있다. 
	public Book() { // 책  클래스에 대한 생성자
		name="None";
		writer="None";
		publish="None";
		year=0;
	}
	public Book(String n, String w, String p, int y) {
		name=n;
		writer=w;
		publish=p;
		year=y;
	}
}

public class Class { //대표클래스
public static void main(String[] args) {
	 // 객체 생성
	 // [클래스명] [객체명] = new [생성자 호출]();
	 Book java=new Book("Java", "Lee", "한빛아카데미",2005);
	 Book sql=new Book("Sql", "Park", "IT_Book", 1998);
	 
	 //객체 멤버 호출, 참조
	 //[객체명].[객체에 있는 멤버 변수/함수 이름];
//	 java.name="Jave";
//	 java.writer="Lee";
//	 java.publish="한빛아카데미";
//	 java.year=2005;
//	 
//	 
//	 sql.setName=("Sql"); // setName :: Sql.name=name(매개변수로 받는정보);
//	 sql.writer="Park";
//	 sql.publish="IT_Book";
//	 sql.year=1998;
//	 
//	 System.out.println("책 이름: "+java.name);
//	 System.out.println("저자 이름:"+java.writer);
//	 System.out.println("출판사 이름: "+java.publish);
//			 System.out.println("출간년도: "+java.year);
//			 System.out.println();
//	 System.out.println("책 이름: "+sql.name);
//	 System.out.println("저자 이름:"+sql.writer);
//	 System.out.println("출판사 이름: "+sql.publish);
//			 System.out.println("출간년도: "+sql.year);
//	
}
}
