package pse_0411;

import java.util.Scanner;

public class text {
	public static void main(String[] args)  {
	Scanner sc=new Scanner(System.in); // �� �ѹ��� �ۼ��ϸ� �� 
	
	
// -�̸�. ����. Ű. �������� "�Է�"�ޱ�
	String name=sc.next();  // �̸� �Է¹ޱ�
	int age=sc.nextInt();	// ���̸� �Է¹ޱ�
		// ���� �Է¹��� �Ǽ��� �Է��� ���, �Ҽ��� ���� ���ڸ� ��� �����ϰ� ������
	double height=sc.nextDouble();	//Ű�� �Է¹ޱ�
	char blood=sc.next().charAt(0); //�������� �Է¹ޱ�
	
	System.out.println("�̸�: "+name);
	System.out.println("����: "+age);
	System.out.println("Ű: "+height);
	System.out.println("������: "+blood);
	
	
		
		
		
		
		
		
		
	}
}
