package pse_0412;

import java.util.Scanner;
// ������ �Ҷ�, �����Լ��� �ִ� ���븸 �����Ѵ�


public class hellojv {
	// ������ �� ��, �����Լ��� �ִ� ���븸 ����
	public static void main(String[] args) {
		// ��¹�
		System.out.print("�ѱ����\n");	// ()���� ���븸 ���
		System.out.println("�ѱ����");	// ()���� ����+ �ٹٲ�("\n")�� ���
		
		Scanner sc=new Scanner(System.in); // "Scanner�� sc��� �̸����� �����Ѵ�/����Ѵ�"
		// ���� :: "���Ҽ� �ִ� ����"
		//;(�����ݷ�) :: ������ ������ ����, "������ ����"
		// ���� ����(����) :: [�ڷ���/Ÿ��] [�����̸�];  
		// �� ���� :: [�����̸�] = [������ ��];
		// ���� �ʱ�ȭ :: [�ڷ���/Ÿ��] [�����̸�] = [������ ��];
		
		
		//�Է¹�
		int i=sc.nextInt(); 
		long l=sc.nextLong(); 
		float f=sc.nextFloat();
		double d=sc.nextDouble();
		char c=sc.next().charAt(0);
		String s=sc.next();
 		
	}
}
