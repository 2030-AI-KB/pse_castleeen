package pse_0411;

import java.util.Scanner;	// �Է¹� �ۼ� �� �ʼ��� �ۼ��� ��
// "�ش� ���Ͽ�, java.util.Scanner��� ���̺귯���� �����ϵ��� �϶�."
// ���̺귯�� :: "������", ���� ��ɹ����� �����ϴ� "������"

public class hellojava {

		public static void main(String[] args) {
			// ����(���ϴ� ����), ���(������ �ʴ� ����)
			// Ÿ���� ����
			int i;		// int(integer) :: ������(�Ҽ����� ���� ����) -128 ~ 127
			long l;		// long :: ������(�Ҽ����� ���� ����)		-1024 ~ 1023
				// -> int������ ǥ�������� �� ����
			float f;	// float :: �Ǽ���(�Ҽ����� �ִ� ����)
			double d;	// double :: �Ǽ���(�Ҽ����� �ִ� ����)
				// -> float������ �� �ڼ��� ǥ�� ����
			char c;		// char(charater) :: ������
			String s;	// String :: ���ڿ� (�ѱ��� ������ String�� ��߾���)
			
			// * ���� ����
			// ���� ����(����) :: [Ÿ��] [�����̸�(name)];
				// "[Ÿ��]�� ������ ���� �� �ְ�, �̸��� [name]�� ������ �����϶�."
				// (ex) int num;	"int�� ������ ���� �� �ְ�, �̸��� num�� ������ �����϶�."
			// �� ����(����) :: [�����̸�(name)] = [������ ��];
				// "[name] ������ �� ���� �����϶�."
				// (ex) num = 3;	"num ������ 3�̶�� ���� �����϶�."
				// ������ :: �������� ���� �������� ���� ������ �� ����.
			// �ʱ�ȭ :: [Ÿ��] [�����̸�(name)] = [������ ��];
				// ������ �����԰� ���ÿ�, �ʱⰪ�� �ٷ� �����ϰԲ� �ϴ� ����
				// (ex) int num=3;	"int���� ������ ���� �� �ְ�, �̸��� num�� ������ �����԰� ���ÿ�
				//					�� num�̶�� ������ 3�̶�� ���� �����϶�."
			
			// �Է¹�
			Scanner sc=new Scanner(System.in);	// Scanner�� sc��� �̸����� ����Ѵ�.
			int v1=sc.nextInt();	// int�� ���� �Է¹�
			long v2=sc.nextLong();	// long�� ���� �Է¹�
			float v3=sc.nextFloat();	// float�� ���� �Է¹�
			double v4=sc.nextDouble();	// double�� ���� �Է¹�
			char v5=sc.next().charAt(0);		// char�� ���� �Է¹�
			String v6=sc.next();	// String�� ���� �Է¹�
			
			System.out.println("�� �Է°��� ���: "+(1+2));
			
			
	
			System.out.println("�̸��� �Է����ּ���");
			String v7=sc.next();
			
			System.out.println("���̸� �Է����ּ���");
			int v8=sc.nextInt();
			
			System.out.println("Ű�� �Է����ּ���");
			double v9=sc.nextDouble();
			
			System.out.println("�������� �Է����ּ���");
			String v10=sc.next();
			
		
			
			System.out.println("�̸��� "+v7+"���̴� "+v8+",Ű�� "+v9+"�������� "+v10+"�Դϴ�.");
			
		}
}
