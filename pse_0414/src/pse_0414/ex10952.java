package pse_0414;

import java.util.Scanner;

public class ex10952 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// ���� 10952�� ���� :: A+B (5)
		// �� �׽�Ʈ ���̽��� 2�� �� ���� ���϶�.
		// �Է��� ���������� 0 0�� �Էµȴ� -> ���ѹݺ���, break Ȱ��
		
		
		// 1.
		
		while(true) { // (�ϴ���) ���Ѵ�� �����Ѵ�.
				// �Է½��� �󸶳� ������ ������, �켱�� �Է��� �޴´�.
				// �Է°��� ���� ������ �������� ������ �����Ǳ� ����
			
			int a=sc.nextInt();
			int b=sc.nextInt();		
			
			// �켱�� ������ ���� ������ �����ϱ�
			if(a==0 && b==0) {break;}
 			
			// �Է°��� ���� ����� ����ϱ�
			System.out.println(a+b);
		}
		// break���� ������, �������� �̵��Ѵ�. (���� �ݺ��� Ż��)
	}
}
