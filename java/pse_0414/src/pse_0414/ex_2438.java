package pse_0414;
import java.util.Scanner;
public class ex_2438 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// ���� 2438�� ���� :: �� ���
		// �Է°��� ����, ��Ģ������ ���� ����
		
		// 1. �� �Է¹ޱ�
		int n=sc.nextInt();
		
		// 2. �� ��� -> 2�� �ݺ���
		// System.out.print("*");
//		System.out.println();�� �ᵵ ���� 
		for(int i=1;i<=n;i++) { // �࿡ ���� ����� �����ϴ� �ݺ���(i�� ������ ���)
			for(int j=1;j<=i;j++)  { //���� ���� ����� �����ϴ� �ݺ��� (j�� ���� ���)
				System.out.print("*");
			}
				System.out.println();				
		}
		
}
}
