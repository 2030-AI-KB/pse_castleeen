package pse_0418;

abstract class Shape{
	//getSize() :: �߻�޼ҵ�, ���� ��ȯ�ϴ� �Լ�
	abstract public double getSize();
}
	// Circle Ŭ���� ����
class Circle extends Shape{
	//��� ���� :: radius (������)
	public int radius;
	public double getSize() {
		return radius*radius*3.14;
	
	}
}
class Triangle extends Shape{
	public int weight;
	public int height;
	public boolean �����ﰢ��;
	public double getSize() {
		return
	}
}
class Rectangle extends Shape{
	public int weight;
	public int height;
	public double getSize() {
		return
	}
	
}
public class Ex_shape {
	public static void main(String[] args) {
		Circle c=new Circle();
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
	
	
	}
}
