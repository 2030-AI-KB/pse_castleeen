package pse_0419;
import java.util.Scanner; 
//super() :: (��Ӱ��迡 ���� ��) �ڽ�Ŭ���� �����ڿ��� �θ� Ŭ���� �����ڸ� ȣ�� �� �� ���
// �߻�Ŭ����, �޼ҵ� :: "abstract", "�߻����� Ŭ����/�޼ҵ�"
	// �߻� Ŭ������ ���� ��ü�� ���� �� ����.
	// �߻� Ŭ�������� �߻� �޼ҵ带 �ϳ� �̻� �ݵ�� �����ؾ��Ѵ�.
	// �߻� �޼ҵ��� ��쿡�� [�Լ� ����� + �Լ� ���Ǻ�] �߿��� ����θ� ����

// Shape Ŭ���� ����( �߻� Ŭ������ �����ϱ� )
abstract class Shape{
	// getSize() :: �߻�޼ҵ�, ���� ��ȯ�ϴ� �Լ�
	abstract double getSize(); // ����� 
	
	//Print() :: �߻�޼ҵ�, �� ��� ������ ���� ���� ����ϴ� �Լ�
	abstract void Print(); 
}

// Circle Ŭ���� ����
class Circle extends Shape{ // �߻� Ŭ������ Shape ��� -> Shape�� �߻�޼ҵ� ������(�������̵�)
	//��� ���� :: radius(������)
	public int radius;
	
	//getSize() �����ϱ�
	public double getSize() { 
		return radius*radius*3.14;
	}
	//Print() �����ϱ�
	public void Print() {
		System.out.println("���� ���� ��ü�Դϴ�.");
		System.out.println("������: "+this.radius); // this�� �Ƚᵵ �����ϴ�.
	}
	//Circle ������ ����
	public Circle(int radius) {
		this.radius=radius;
	}
}
//Triangle Ŭ���� ����
class Triangle extends Shape {
	// ��� ���� :: w(�غ�) h(����) boolean tf(�����ﰢ������ �ƴ���)
	public int w;
	public int h;
	public boolean tf;
	
	// getSize() �����ϱ�
	public double getSize() { 
		return w*h*(0.5);
	}
	// Print() �����ϱ�
	public void Print() {
		System.out.println("�ﰢ���� ���� ��ü�Դϴ�.");
		System.out.println("�غ�: "+this.w);
		System.out.println("����: "+this.h);
		System.out.println("�����ﰢ���ΰ�? "+this.tf);
	}
	//Triangle ������ ����
	public Triangle(int w, int h, boolean tf) {
		this.w=w;
		this.h=h;
		this.tf=tf;
	}
}
//Rectangle Ŭ���� ����
class Rectangle extends Shape {
	// ��� ���� :: w(�غ�) h(����)
	public int w;
	public int h;
	
	// getSize() �����ϱ�
	public double getSize() { 
		return w*h;
	}
	// Print() �����ϱ�
	public void Print() {
		System.out.println("�簢���� ���� ��ü�Դϴ�.");
		System.out.println("�غ�: "+this.w);
		System.out.println("����: "+this.h);
	}
	//Rectangle ������ ����
		public Rectangle(int w, int h) {
			this.w=w;
			this.h=h;
		}
}
public class Review_Shape {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// ��ü ���� ��, �� ��� ���� �ʱ�ȭ�ϱ� 
//		-Circle �� ���� ��ü ����
		Circle c=new Circle(sc.nextInt());
//		-Triangle�� ���� ��ü����
		Triangle t=new Triangle(sc.nextInt(),sc.nextInt(),sc.nextBoolean());
//		-Rectangle�� ���� ��ü ����
		Rectangle r=new Rectangle(sc.nextInt(),sc.nextInt());
		
		c.Print();
		System.out.println("�� ���� ���̴� "+c.getSize()+"�Դϴ�.");
		t.Print();
		System.out.println("�� �ﰢ���� ���̴� "+t.getSize()+"�Դϴ�.");
		r.Print();
		System.out.println("�� �簢���� ���̴� "+r.getSize()+"�Դϴ�.");
	}
}
