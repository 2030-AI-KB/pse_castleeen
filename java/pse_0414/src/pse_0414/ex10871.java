package pse_0414;

import java.util.Scanner;

public class ex10871 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// ���� 10871�� ���� :: x���� ���� ��
		// �־��� ���ڵ� �߿��� Ư�� ��(x)���� �����͸� ����Ѵ�.
		// �迭�� �Է��� ���ڵ�� x�� ���� �ϳ��� ���Ͽ�, ���� ���� ����Ѵ�.
		
		// 1. �迭�� �� ���ڵ��� ũ�� �Է¹ޱ� ( + �迭����)
		int n=sc.nextInt();
		int arr[]=new int [n];
		
		// 2. �������� �Ǵ� ����(x) �Է¹ޱ�
		int x=sc.nextInt();
		
		// 3. �迭 �� �Է¹ޱ�
		for(int i=0;i<n;i++) { 	// i�� 0~(n-1)���� ���� ��
			arr[i]=sc.nextInt();
		}
		
		// 4. x�� arr�� ������ �ϳ��� ���ؼ�, ����ϱ�
		for(int i=0; i<n;i++) {
			if(arr[i]<x) { // arr�� "���� Ž�� ����(i��°)" ���� x���� ������,
				System.out.print(arr[i]+" "); //if�� ���ǹ��� ������ arr�� + ���� ��� 
		}


	
	}
	}
}