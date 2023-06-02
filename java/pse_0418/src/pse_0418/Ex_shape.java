package pse_0418;

abstract class Shape{
	//getSize() :: 추상메소드, 넓이 반환하는 함수
	abstract public double getSize();
}
	// Circle 클래스 생성
class Circle extends Shape{
	//멤버 변수 :: radius (반지름)
	public int radius;
	public double getSize() {
		return radius*radius*3.14;
	
	}
}
class Triangle extends Shape{
	public int weight;
	public int height;
	public boolean 직각삼각형;
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
