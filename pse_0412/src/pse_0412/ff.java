package pse_0412;

import java.util.Scanner;

public class ff {
	public static void main(String[] args) {
		
	
		
    //������ 
	//��������� :: +, -, *, /(�� ������), %(������ ������)
	//���Կ����� :: = (�������� ���� ���ʿ� "����"�Ѵ�.)
	//�񱳿����� :: <,<=,>,>=, ==("����"), !=("�ٸ���",�ݴ�)
	//�������� :: &&("�׸���"), ||("�Ǵ�")	
		
	//���ǹ� (if) :: "���࿡ ~ �Ѵٸ�", ������ �����鼭 ��ɹ��� �����ϰԲ� �ϴ� ����
		// if - else if - else, switch
		// else if, else�� ���� ����������, if�� �����ϰ� else if, else�� ����ϸ� �����߻�
		
		// ���� :: �Է¹޴� ������ ���� ������ ����ϱ�
		// 1. ���� �Է¹ޱ�
		
		Scanner sc=new Scanner(System.in);
		
		int score;
		score=sc.nextInt();

		// 2. ������ ���� ���� ����ϱ�
		// ������ ���� ���� ������ �ٸ��� ����ؾ��� -> ���ǹ� ��� 
		// if() { //if(����) -> "���� [����]��  �����Ѵٸ�,"
		//		�� ���ǹ��� ������ ��, ������ ��ɹ���
		// }
		
		score=score/10;   //���� score�� ���� 10�� ���� ���� score�� �����϶�.
		// ��������  score�� ���� �������� �뵵
		// ������ score�� ������ ����
		System.out.println("���� ó���� ��: "+score);
		
		 if(score==10 || score==9) {
			 System.out.println("A�����Դϴ�");
		 }
		 else if(score==8) { 
			 System.out.println("B�����Դϴ�");
		 }
		 else if(score==7) {
			 System.out.println("C�����Դϴ�");
		 }
		 else if(score==6) {
			 System.out.println("D�����Դϴ�");
		 }
		 else {
			 System.out.println("F�����Դϴ�.������� ���մϴ�");
		 }
		 
		 
//		switch(score) {
//		case 10:
//		case 9:
//			System.out.println("A�����Դϴ�");
//			break;
//		case 8:
//			System.out.println("B�����Դϴ�.");
//			break;
//		case 7:
//			System.out.println("C�����Դϴ�");
//			break;
//		case 6:	
//			System.out.println("D�����Դϴ�");
//			break;
//		default :
//			System.out.println("F�����Դϴ�.������� ���մϴ�");
//			break;
//		}
		
//		if(score>=90) {    //score�� ���� 90���� ũ�ų� ���ٸ�,
//			System.out.println("A�����Դϴ�");
//		}
//	
//	
//		else if(score>=80) {	//�� ���ǹ��� �������� �ʰ�, score�� 80 �̻��̶��,
//			System.out.println("B�����Դϴ�.");
//		}
//		else if(score>=70) {
//			System.out.println("C�����Դϴ�");
//		}
//		else if(score>=60) {
//			System.out.println("D�����Դϴ�");
//		}
//		
//		else { // �� ���ǵ��� ��� �������� �ʴ´ٸ�, 
//			System.out.println("F�����Դϴ�.������� ���մϴ�");
//		}
		
		// 2. ������ ���� ���� ����ϱ�
		// ������ ���� ���� ������ �ٸ��� ����ؾ��� -> ���ǹ� ���
		// switch(���� ���� ���� v) {
		// case [��1]:
		//     [��1]�� v�� ���� ��� ������ ��ɹ�
		//	   break;
		// case [��2]:
		//     [��2]�� v�� ���� ��� ������ ��ɹ�
		//     break;
		// default :
		//      ���� case�� ���õ� ����� ��� ���� ���� ��� ������ ��ɹ� 
		// }
		
		
	
		
		
		
		
		
		
		
}

}