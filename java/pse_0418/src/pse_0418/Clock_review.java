package pse_0418;

class Clock{
	// ��� ���� :: �� (hour) ��(min) ��(sec)
	
	public int hour;
	public int min;
	public int sec;

		// ������ :: " ���ο� �ð��� ���� ��ü �����մϴ�"" ����� ��, �� ���� �ʱ�ȭ
		// this :: �ش� �޼ҵ带 �ҷ��� ��ü �ڽ��� ��Ī
	public Clock(int h, int m, int s) {
		System.out.println("���ο� �ð��� ���� ��ü�� �����մϴ�.");
		this.hour=h; //this�� ���� ��� ������, ��ü������ ��Ȯ�� �������ش�.
		this.min=m;
		this.sec=s;
	}
	// ��� �Լ�
	// 1. ���� �ð��� ��Ĵ�� ������ִ� �޼ҵ�
	public void Print() {
		//��(hour)�� ���� ��¹�
		if(this.hour<10) {
		System.out.print("0");
		}
		System.out.print(hour+":");
		//��(min)�� ���� ��¹�
		if(this.min<10) {
		System.out.print("0");
		}
		System.out.print(min+":");
		//��(sec)�� ���� ��¹�
		if(this.sec<10) {
		System.out.print("0");
		}
		System.out.println(sec+"�Դϴ�.");
	}

 //�������� ���� ������ ������ְ�, ǥ�ؽð���� ������ִ� �޼ҵ�
	public void ap() {
			if(hour<12) {
				System.out.print("����� �����Դϴ�. AM ");
				Print();
			}
			else {
				System.out.print("����� �����Դϴ�. PM ");
				hour-=12;// ���� ���꿡 ������ �� �� �ֱ� ������, ����õ�ϴ� ��� 
				Print();
				
			}
			
	}
public class clock_review {
	public static void main(String[] args) {
		// ��ü ����
		Clock c1=new Clock(9,10,30);
		Clock c2=new Clock(16,40,0);
		System.out.println();
		
		c1.Print();
		c2.Print();
		System.out.println();
		
		c1.ap();
		c2.ap();
	}
}
}