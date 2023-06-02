package pse_0418;

import java.util.Scanner;

class Time{ //부모클래스
	public int hour;
	public int min;
	public int sec;
	
	// 생성자
	public Time(int h, int m, int s) {
		System.out.println("CLOCK 생성자 실행");
		this.hour=h;
		this.min=m;
		this.sec=s;
	}
	public void Print() {
		System.out.println("현재시각은 "+this.hour+"시 "+this.min+"분 "+this.sec+"초 입니다.");
		
	}
}

//"상속을 받을 시에, 부모 클래스가 있다면 부모 클래스의 생성자를 먼저사용해라."
// super() :: 부모클래스의 생성자를 실행하게끔 한다.
class Smartclock extends Time { //자식 클래스
	public int walk;
	public String os;

	public Smartclock(int h, int m, int s, String os, int w) {
		super(h, m, s);	// 부모 클래스의 생성자를 실행하여, 시분초의 정보를 초기화한다.
		// 자식클래스 생성자 실행 시, super()를 가장먼저 실행해줘야한다.
		System.out.println("Smartclock 생성자 실행");
		this.os=os;
		this.walk=w;
	}
	public void Print() {
		System.out.println("현재시각은 "+this.hour+"시 "+this.min+"분 "+this.sec+"초 입니다." );
		System.out.println("현재까지 걸은 횟수:"+this.walk);
		System.out.println("운영체제: "+this.os);
	}
	}

public class new_cl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//객체 생성
		Time c=new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		int h=sc.nextInt();
		int m=sc.nextInt();
		int sec=sc.nextInt();
		String o=sc.next();
		int w=sc.nextInt();
				
		Smartclock s=new Smartclock(h,m,sec,o,w);
		
		c.Print();
		s.Print();		// 오버라이딩 :: 부모클래스 메소드의 내용을 덮어썼다.
	}
}
