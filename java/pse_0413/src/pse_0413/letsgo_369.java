package pse_0413;

public class letsgo_369 {
	public static void main(String[] args) {
		
		//���� :: 369������ ��Ģ�� �̿��� ���α׷� �����
		//100�� �Ǹ� �ݺ��� ����
		int i=1;
		//���� �ݺ������� �����ϱ�
		while(true) {
		    //i�� ���� 100�� �Ǹ� �ݺ��� ���� 
			if(i==100) {break;}
			
			
			// ���� �ڸ�, ���� �ڸ� ����
			int n1=i/10; //���� �ڸ�
			int n2=i%10;
			
//			-���ڿ� 3, 6, 9�� �ִ� ���, "�ڼ� ¦"�� ���
			if(n1==3||n1==6||n1==9||n2==3||n2==6||n2==9) {
				System.out.println("�ڼ� ¦");
				i++;
				continue;
			}
//			if(n1%3==0&&n1!=0||n2%3==0&&n2!=0) {
//				System.out.println("�ڼ� ¦");
//				i++;
//				continue;
//			}
//			-���ڿ� 3, 6, 9�� ���� ���, ���ڸ� �״�� ���
	
			System.out.println(i);
			i++; 
		}
		//���� break���� ������ �������� �̵���
}
}