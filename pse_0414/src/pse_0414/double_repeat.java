package pse_0414;

import java.util.Scanner;
public class double_repeat {
	public static void main(String[] args) {
		// 2�� �ݺ���
		Scanner sc=new Scanner(System.in);
		
		// ���� :: 4�� �л��� ������ ������ �Է¹ް� �� �л��� ���� ����� �����.
		// �л��� ������ ���, ������ ���� ���
		int score[][]=new int [4][3]; // �л��� �� 4, ������ ������ ���� 3
		for(int i=0;i<4;i++) { // i�� 0������ 3������
			for(int k=0;k<3;k++) { //k�� 0������ 2������
				score[i][k]=sc.nextInt();
		}	
	}
		// 2. �� �л��� ���� ��� ����
		for(int i=0;i<4;i++) { // i�� 0������ 3������
			// (1) �հ� ���ϱ�
			int sum=0;
			for(int k=0;k<3;k++) { //k�� 0������ 2������
				sum+=score[i][k];  // Ư�� �л��� ������ ���� ���� ����\
			}
			//���� ���� ����, i��° �л��� ������ �հ谡 sum�� ����Ǿ�����
			
			// (2) ����� ��� �ٷ� ��� 
			double avg=(double)sum/3;
			//double avg=sum/3.0; �� �ȴ�
			System.out.println((char)(i+'A')+"��° �л��� �����"+avg);				
		}	
	}
}
	
