package pse_0414;

import java.util.Scanner;

public class ex1330 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//���� 1330�� ���� :: �μ� ���ϱ�
		// �� ���� �Է¹ް�, �̵��� ũ�⸦ ���϶� (�����:>,<,==)
		
		// 1. �� ���� �Է¹ޱ�
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//2.�� ��� ����ϱ�
		if(a==b) { //a�� b�� ���� ���ٸ�,
			System.out.println("==");
			
		}
		else if(a<b) { //a�� b�� �����ʰ�, a�� b���� �۴ٸ�,
			System.out.println("<");
		}
				
		else { // ���� ���ǵ��� ��� �������� �ʴ� ��� (a�� b���� ũ�ٸ�),
			System.out.println(">");
			
		}
				
				
}
}