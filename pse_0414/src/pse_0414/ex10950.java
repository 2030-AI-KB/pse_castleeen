package pse_0414;

import java.util.Scanner;

public class ex10950 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// ���� 10950�� ���� :: A+B (3)
		
		// 1. ���� ���� ���� �Է¹ޱ�
		int n=sc.nextInt();
	
		// 2. [�� ���ڽ� �Է� �� ���� ���� ���] �ݺ� ����
		for(int i=1;i<=n;i++) { //i�� 1~5 ������ ������
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			// ���� ���� ���� �� ����
			int sum=a+b;
		
			// ���� ��� ���
			System.out.println(sum);
		}
	
	
	}
}
