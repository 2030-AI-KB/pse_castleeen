package pse_0418;
// �߻�Ŭ���� (+�߻�޼ҵ�)

// �߻�Ŭ���� ����
// abstract class Ŭ�����̸� { 
//       Ŭ������ �� ���
//�߻� Ŭ�������� �߻� �޼ҵ带 �ϳ��̻��� �����ؾ���
abstract class animal{	// �߻� Ŭ���� :: �θ� Ŭ����
	    // ���� �޼ҵ�� �Լ� ���� + �Լ� ��üȭ ���°� ���� �־��������
	    // �߻� �޼ҵ��� ���� �Լ� ���� ��
		//abstract [�޼ҵ� �����(����������, ��ȯ��, �Լ��̸� ��)];
		abstract public void cry();
	}

 class Cat extends animal { // �Ϲ����� Ŭ���� :: �ڽ� Ŭ���� 
	 // �θ�Ŭ�������� ���� �Ǿ��ִ� cry() �Լ��� ���޹��� ����
	 // cry() �Լ��� ���� ��ɹ� �ۼ��� �ڽ� Ŭ�������� ���ѱ�� �ִ� ��Ȳ -> �������̵�
	 public void cry() { 
		 System.out.println("�߾ƿ�");
	 }
 }
 class Dog extends animal {
	 public void cry() {
		 System.out.println("����");
	 }
 }
public class Abstract { // �߻�����
	public static void main(String[] args) {
		//Animal cat=new Animal();
		// �߻� Ŭ������ ���ؼ� ��ü�� �ٷ� ������ �� ����]
		// �߻� Ŭ������ ��ӹ��� Ŭ�������� ��üȭ�Ͽ� ��ü�� �����ؾ��� (�������̵� ����)
		
		Cat c=new Cat();
		Dog d=new Dog();
		
		c.cry();
		d.cry();
	}

}
