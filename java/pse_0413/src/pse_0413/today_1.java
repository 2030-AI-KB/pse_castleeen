package pse_0413;

import java.util.Scanner;

public class today_1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// break�� :: �� ��ɹ��� ������ ���� ����Ǵ� �ݺ��� ��������
	
		int num=1;
		while(true) { 
			if(num>10) {break;} // ������ num�� ���� 11�� �Ǵ¼��� break�� ����
			
			System.out.print("���� �ݺ��� �ȿ� �ֽ��ϴ�. ");
			System.out.println(num);
			num++;
		}
	
		// ����:: 1���� 10���� Ȧ���� ����ϴ� ���α׷�
		// Ȧ���� ���, 2�� �������� �� �������� 1
		// ¦���� ���, 2�� �������� �� �������� 0
		// continue :: �� ��ɹ��� ������ �ݺ����� ���� ù�κп� ���ư�
		int n=1;
		while(n<=10) {
			if(n%2==1) {	//Ȧ���� ���  
			 System.out.println(n+"continue ���");
			 n++ ;
			 continue;
			}
			System.out.println(n);
			n++;
	
}
		
		
		
		
		
		
}
}