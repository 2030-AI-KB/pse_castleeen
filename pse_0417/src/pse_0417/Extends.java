package pse_0417;
// ��� :: �θ� �ڽĿ��� "�����ش�"
// -> extends Ű���带 �����, �θ� Ŭ������ ������� �ڽ� Ŭ�������� �����ִ� ����
// �ڽ� Ŭ������ ��� = �θ� Ŭ������ ��� + �ڽŸ��� ���

// ���� :: phone, Smart phone Ŭ���� ����
class Phone { 		// 2G�� Ŭ���� , �θ�Ŭ����
	public String tel; // ��ȭ��ȣ
	public boolean touch; // ���� �Ǵ��� �ȵǴ���
	
	public void Print() {
		System.out.println("��ȭ��ȣ: "+this.tel);
		System.out.println("�� ���� ����: "+this.touch);
		
	}
}
class SmartPhone extends Phone{  // ����Ʈ�� Ŭ����, �ڽ�Ŭ���� 
	// �θ�Ŭ�����κ��� ��������  ��� ����
//	public String tel; // ��ȭ��ȣ
//	public boolean touch; // ���� �Ǵ��� �ȵǴ���
	public String os; // �ü�� ����
	
	public void Print() {
		System.out.println("��ȭ��ȣ: "+this.tel);
		System.out.println("�� ���� ����: "+this.touch);
		System.out.println("�ü�� ����: "+this.os);
	}
}

// �������̵� :: �θ� Ŭ������ �޼ҵ带 �ڽ� Ŭ�������� "������"�ϴ� ����
//	        	=> �Լ��� ������ "�����" �Ѵ�
// �Լ� �̸��� �Ű����� ���� ��� �Ȱ��� �ؼ� "�����" ����  - ����

public class Extends {
	public static void main(String[] args) { 
			// Phone Ŭ������ ���� ��ü ����
		Phone p=new Phone();
		p.tel="010-1234-5678";
		p.touch=false;
		
		//SmartPhone�� ���� ��ü ����
		SmartPhone sp=new SmartPhone();
		sp.tel="010-2272-6311";
				sp.touch=true;
				sp.os="Icecream_sandwich";
		
		p.Print();
		System.out.println();
		sp.Print();
		
}
	
}