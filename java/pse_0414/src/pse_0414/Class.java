package pse_0414;

// ��ü :: �ǻ�Ȱ �ӿ� �����ϴ� ��� ��ü/�繰
// Ŭ������ ���� ������� �� 

// Ŭ���� :: ��ü�� ����� ���� �����ϴ� "Ʋ" -> ��ü�� ���� ����
// �ڷ��� �� Ÿ���� ���Ƿ� ����
class Person{
	// ���� -> ��� ����
	// ��� ���� ����
	//[����������] [Ÿ��] [�����̸�] ;
	String name; // �̸�
	String gender; //���� 
	
	// �ൿ -> ��� �Լ�
}
// ���� �ȿ� ��ǥ Ŭ������ �ݵ�� �ϳ��� �־����
public class Class {  // ��ǥŬ���� :: main�� ���⿡ �ۼ�
	public static void main(String[] args) {    //main �Լ�
		// ��ü ����
		// [Ŭ������] [��ü��] = new [Ŭ������]();
		Person park=new Person(); 
		Person lee=new Person();// "Person Ÿ���� ��ü lee�� �����϶�." 
		// ��ü ��� ����
		// [��ü��].[����̸�]
		lee.name="yuna";
		lee.gender="Woman";
		park.name="DH";
		park.gender="Man";
		
		System.out.println("lee�� name��: "+lee.name);
		System.out.println("lee�� gender�� "+lee.gender);
		System.out.println();
		System.out.println("park�� name��: "+park.name);
		System.out.println("park�� gender�� "+park.gender);
		// Ŭ������ ���ؼ� ����� ���� 
		// ��ü�� �� ���·� ���� ä������.
		
}
}