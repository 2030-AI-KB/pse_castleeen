package pse_0419;
// �������̽� :: "�߻�Ŭ������ �ſ� ������ ����"
//	 " ��ü������ ��õ� ��� �Լ��� ���Ǿ��ٰ� ���Ƶ���"
// 	"�������̽��� ��� �ʵ�� ������ �ƴ� ����� ���"

//interface Ű���带 �̿��� �������̽� ���� 
interface Animal{
	// ��� �Լ��� ��� �߻� Ŭ������, �ʵ�� ��� ����� �����Ѵ�.
	// static :: �ش� Ŭ������ ���� ������� ��ü�� "����"�ϴ� ��
	// final :: ����� ������ ��  ���Ǵ� Ű���� / ó�� ���� ������ ����X
	public static final String Location="00������";
	abstract public void cry();
	
}
class Cat implements Animal{//�������̽� ��� :: implements
	// ���: Location
	public void cry() {
		System.out.println("�Ͼƾ�");
	}
}
public class Interface {
	public static void main(String[] args) {
		//�߻� Ŭ������ ����������, �������̽� ��ü������ ��ü ����X
		// Animal a =new Animal();
		
		// �������̽��� ��ӹ޾� �߻� �޼ҵ� ���Ǹ� �ؾ� ��ü ������ �����ϴ�.
		Cat c=new Cat();
		System.out.println("��ġ�ϴ� ��: "+c.Location);
		c.cry();
		
	}
}
