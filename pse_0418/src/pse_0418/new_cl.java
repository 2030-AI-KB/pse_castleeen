package pse_0418;

import java.util.Scanner;

class Time{ //�θ�Ŭ����
	public int hour;
	public int min;
	public int sec;
	
	// ������
	public Time(int h, int m, int s) {
		System.out.println("CLOCK ������ ����");
		this.hour=h;
		this.min=m;
		this.sec=s;
	}
	public void Print() {
		System.out.println("����ð��� "+this.hour+"�� "+this.min+"�� "+this.sec+"�� �Դϴ�.");
		
	}
}

//"����� ���� �ÿ�, �θ� Ŭ������ �ִٸ� �θ� Ŭ������ �����ڸ� ��������ض�."
// super() :: �θ�Ŭ������ �����ڸ� �����ϰԲ� �Ѵ�.
class Smartclock extends Time { //�ڽ� Ŭ����
	public int walk;
	public String os;

	public Smartclock(int h, int m, int s, String os, int w) {
		super(h, m, s);	// �θ� Ŭ������ �����ڸ� �����Ͽ�, �ú����� ������ �ʱ�ȭ�Ѵ�.
		// �ڽ�Ŭ���� ������ ���� ��, super()�� ������� ����������Ѵ�.
		System.out.println("Smartclock ������ ����");
		this.os=os;
		this.walk=w;
	}
	public void Print() {
		System.out.println("����ð��� "+this.hour+"�� "+this.min+"�� "+this.sec+"�� �Դϴ�." );
		System.out.println("������� ���� Ƚ��:"+this.walk);
		System.out.println("�ü��: "+this.os);
	}
	}

public class new_cl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//��ü ����
		Time c=new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		int h=sc.nextInt();
		int m=sc.nextInt();
		int sec=sc.nextInt();
		String o=sc.next();
		int w=sc.nextInt();
				
		Smartclock s=new Smartclock(h,m,sec,o,w);
		
		c.Print();
		s.Print();		// �������̵� :: �θ�Ŭ���� �޼ҵ��� ������ ������.
	}
}
