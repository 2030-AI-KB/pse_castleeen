package pse_0417;
// ��ü:: �ǻ�Ȱ�� �����ϴ� �繰�̳� ��ü / Ŭ������ ���� ������� ��
// Ŭ����:: ��ü�� ������ "Ʋ"

// ���� :: å Ŭ����
// class Ŭ�����̸� {
//		��� ����
//}
class Book{
	// ��� ����
	//[����������] [Ÿ��] [�����̸�];
	// �������� :: ����� ���� ������ �����ϴ� ����
	// public("��𿡼��� �����Ӱ� ������ �����ϴ�.")
	//private("�ڽ��� Ŭ���� �̿��� �������� ������ �����Ѵ�.")
	private String name; // å�̸�
	public String writer; // ���� �̸�
	public String publish; // ���ǻ� 
	public int year; //�Ⱓ����
	
	// getter, setter
	// this ::"�̰�", ȣ����� ��ü �ڽ��� ��Ī��
	public String getName() { // �Լ��� ȣ���� ��ü�� name�� ��ȯ
		return name;
	}

	public void setName(String name) { // �Լ��� ȣ���� ��ü�� name���� �Ű������� ���� ������ ����
		this.name = name;
	}

	//��� �Լ�(�޼ҵ�)
	// ��� ��� ���� �� ����ϴ� �޼ҵ� �����
	public void Print() {
		System.out.println("å �̸�: "+name);
		System.out.println("�����̸�: "+writer);
		System.out.println("���ǻ��̸�: "+publish);
		System.out.println("�Ⱓ����: "+year);
	}

	// ������ :: ��ü�� �����ϴ� �� (�޼ҵ� �� �ϳ�)
	// �����ڴ� ���� ��� �������� �ʱⰪ�� �����ϴ� ���� ���� 
	// �����ڰ� ������ ���� ������. Ŭ������ ������ �� �ڵ����� ��������� �⺻ �����ڸ� ���������� ����� 
// class Book() {}	
	
	
	
	// 1. �����ϴ� ��� (��ȯ��(void)X)
	// 2. ȣ���ϴ� ���
	// ��ü ������ �ڵ����� ȣ�� 
	
//	public Ŭ�����̸� (�Ű�����Ÿ�� �Ű����� �̸�, ...) {
//		�����ڷ� ������ ��ɵ�
//	}
	
	//���� �ε� :: �޼ҵ��� �̸��� ������, �Ű������� ������ �ٸ� ��� �����ؼ� ����� �� �ִ�. 
	public Book() { // å  Ŭ������ ���� ������
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

public class Class { //��ǥŬ����
public static void main(String[] args) {
	 // ��ü ����
	 // [Ŭ������] [��ü��] = new [������ ȣ��]();
	 Book java=new Book("Java", "Lee", "�Ѻ���ī����",2005);
	 Book sql=new Book("Sql", "Park", "IT_Book", 1998);
	 
	 //��ü ��� ȣ��, ����
	 //[��ü��].[��ü�� �ִ� ��� ����/�Լ� �̸�];
//	 java.name="Jave";
//	 java.writer="Lee";
//	 java.publish="�Ѻ���ī����";
//	 java.year=2005;
//	 
//	 
//	 sql.setName=("Sql"); // setName :: Sql.name=name(�Ű������� �޴�����);
//	 sql.writer="Park";
//	 sql.publish="IT_Book";
//	 sql.year=1998;
//	 
//	 System.out.println("å �̸�: "+java.name);
//	 System.out.println("���� �̸�:"+java.writer);
//	 System.out.println("���ǻ� �̸�: "+java.publish);
//			 System.out.println("�Ⱓ�⵵: "+java.year);
//			 System.out.println();
//	 System.out.println("å �̸�: "+sql.name);
//	 System.out.println("���� �̸�:"+sql.writer);
//	 System.out.println("���ǻ� �̸�: "+sql.publish);
//			 System.out.println("�Ⱓ�⵵: "+sql.year);
//	
}
}
