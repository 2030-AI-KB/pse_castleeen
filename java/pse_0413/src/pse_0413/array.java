package pse_0413;

import java.util.Scanner;


public class array {
	public static void main(String[] args) {
		// �迭 :: ���� Ÿ���� ���� ���� ������ �� �ִ� ���� ����
		Scanner sc=new Scanner(System.in);
		// �迭 ����
//		(Ÿ��) (�迭�̸�)[] = new(Ÿ��) [�迭ũ��];
		int arr[]=new int [5]; // "�̸��� arr�� ������ �迭�� �����ϰ�,�� �迭�� ũ�⸦ 5�� �϶�."

		
		// �迭 �� ���� :: (�迭�̸�)[�迭�ε���] = (������ ��);
		arr[0]=100; // "arr �迭�� 0��° ������ 100�� �����϶�"
		
		//�迭�� ������ ���
		System.out.println("� �迭 ������ ��: "+arr[0]);
		
		// ���� :: 5���� �л� ������ �Է¹ް�, �̵��� �հ�� ����� ���϶�.
		//1. 5���� �л� ���� �Է�
		// �л� ������ ������ ������ �迭�� �켱 �����Ѵ�.
		int score[]=new int [5];
		for(int i=0;i<5;i++)
		{		score[0]=sc.nextInt();
		}
		// 2. �հ� ���ϱ�
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=score[i]; // ���� sum�� i��° score���� ���ؼ� �����϶�.
			//	
		}
	
		//3. ��� ���ϱ�
		//[����]/[����] = [����]
		//[�Ǽ�]/[����] = [�Ǽ�]
		//[����]/[�Ǽ�] = [�Ǽ�]
		double avg=sum/5;
		
		//4. �հ�� ��� ����ϱ�
		System.out.println("���� �հ�: "+sum);
		System.out.println("���� �հ�: "+avg);
}
}


