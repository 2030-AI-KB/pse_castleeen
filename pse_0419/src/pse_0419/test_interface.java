package pse_0419;
import java.util.Scanner;
//"�Ѻ��̵��"���� ����� ���縦 ��ü�� �����Ͽ� ������ �������
//
//-Book �������̽�
interface Book {
//	�ʵ� :publish("�Ѻ��̵��")
	public static final String publish="�Ѻ� �̵��";
//	�޼ҵ� : Print(), updown2000() ->�߻� �޼ҵ�� �ۼ�
	abstract public void Print();
	abstract public void updown2000();
}
class Java implements Book{
//	���: �����⵵(year), �̸�(name, ����� ������ �� "Java"�� ����)
	public int year;
	public final String name="Java";
	
	//Print() -> ���ǻ�, �����⵵, å�̸� ���
	public void Print() {
		System.out.println("å �̸�: "+this.name);
		System.out.println("���ǻ�: "+this.publish);
		System.out.println("�����⵵: "+this.year);
	}
	// updown2000() :: �����⵵�� ����, ������ �������� �ƴ����� ���
	public void updown2000() {
		if(this.year>=2000) {
			System.out.println("������ �����Դϴ�.");
		}
		else {
			System.out.println("�����Ǳ� ������ �����Դϴ�.");
		}
	}
	
	public Java(int y) {
		this.year=y;
	}
}
class Python implements Book{
	public int year;
	public final String name="Python";
	
	//Print() -> ���ǻ�, �����⵵, å�̸� ���
	public void Print() {
		System.out.println("å �̸�: "+this.name);
		System.out.println("���ǻ�: "+this.publish);
		System.out.println("�����⵵: "+this.year);
	}
	// updown2000() :: �����⵵�� ����, ������ �������� �ƴ����� ���
	public void updown2000() {
		if(this.year>=2000) {
			System.out.println("������ �����Դϴ�.");
		}
		else {
			System.out.println("�����Ǳ� ������ �����Դϴ�.");
		}
	}
	
	// ������ ����
	public Python(int y) {
		this.year=y;
	}
}
public class test_interface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//��ü ����
		Java j=new Java(sc.nextInt());
		Python p=new Python(sc.nextInt());
		
		j.Print();
		j.updown2000();
		System.out.println();
		p.Print();
		p.updown2000();
	}
}
