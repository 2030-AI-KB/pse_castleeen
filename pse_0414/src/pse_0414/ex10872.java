package pse_0414;

import java.util.Scanner;

public class ex10872 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// ���� 10872�� ���� :: ���丮��
		// 01 = 1
		// 10! = 10*9*8*7*6*5*4*3*2*1
		
		// 1. �� �Է¹ޱ�
		int n=sc.nextInt();
		
		// 2. ����� ������ ���� �����
		int result=1;
		
		// 3. ���丮�� ���� ���� ���� (for��)
		for(int i=1;i<=n;i++) {  //i�� 1~n���� ������ ����
			result*=i;		// result�� ���������� 1~n���� ����
			
		//	3. ���丮�� ���� ���� ���� (while��)
//		while(n>0) { // n�� ������
//			result*=n;
//			n--;
		}
		
		// n�� 0�� �Ǵ¼��� while�� ����
		
		
		// 4. ����� ���
		System.out.println(result);		
	}
}
