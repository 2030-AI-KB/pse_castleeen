package pse_0414;

import java.util.Scanner;

public class ex14681 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// ���� 14681�� ���� :: ��и� ����
		// x��� y���� ���� �Է¹ް�, �� ��ǥ�� ��ġ�ϴ� ��и� ��ȣ�� ����϶�.
		//(��, x���� y���� 0�� �ƴѰ��̶�� �����Ѵ�.)
		
		// 1. x��� y�� �� �Է¹ޱ�
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		// 2.���� �������� ������� Ȯ��
		
		if(x>0 && y>0) { // x�� 0���� ũ��, y�� 0���� Ŭ��,
			System.out.println("1");
		}
		else if(x<0 && y>0) { // x�� 0���� �۰�, y�� 0���� Ŭ��,
			System.out.println("2");
		}
		else if(x<0 && y<0) { // x�� 0���� �۰�, y�� 0���� ���� ��,
			System.out.println("3");
		}
		else { //�� ���ǹ����� ��� �����������ϸ�
			System.out.println("4");
		}
	
	
		// ����. ��ø if��
		if(x>0) { //x�� 0���� ũ�ٸ�
			if(y>0) { // y�� 0���� ũ�ٸ�.
				 System.out.println("1");
			}
			else { // y�� 0���� �۴ٸ�,
				System.out.println("4");
			}
		}
		else { // x�� 0���� �۴ٸ�,
			if(y>0) { // y�� 0���� ũ�ٸ�,
				System.out.println("2");
			}
			else { // y�� 0���� �۴ٸ�
				System.out.println("3");
			}
		}	
		
}
}