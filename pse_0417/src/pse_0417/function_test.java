package pse_0417;

import java.util.Scanner;

public class function_test {
	//���� ���� �ð��� �Է¹ް� �Ʒ��� �Լ��� �����ϰԲ� �Ͽ���
	//1) clock() :: ���� �ð�(��, ��, ��)�� ���޹޾� ��Ĵ�� ����ϴ� �Լ�
	static void clock(int hour, int min, int sec) {
		// ��, ��, �ʿ� ���� ���� ���� -> �Ű������� 3���� ����

		System.out.println("����ð���" + hour+"�� "+min+"�� "+sec+"���Դϴ�.");
		
	}
	//2) ap() :: ���簡 �������� �������� ����ϴ� �Լ�
	static void ap(int hour) {
		if(hour<12) {
			System.out.println("����� �����Դϴ�.");
		}
		else {	//"�� ������ 12���� ũ�ų� �۰ų�"
			System.out.println("����� �����Դϴ�.");
		}
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	//1. ��, ��, �ʿ����� ���� �Է¹ޱ�
	//void�� ��ȯ������ �����Ҷ�����  return�� ��� X
	int h=sc.nextInt();
	int m=sc.nextInt();
	int s=sc.nextInt();
	
	//2. ���� �ð� ����ϴ� �Լ� ȣ��(����)
	clock(h,m,s);
	
	//3. �������� ���������� ����ϴ� �Լ� ȣ��(����)
	ap(h);

}
}
