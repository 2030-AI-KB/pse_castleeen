package pse_0418;
import java.util.Scanner;

public class nextline {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// nextline() :: ������ ������ ���ڿ� �Է¿� ��� (���鵵 �Է�, Enter �Է�)
		
//		char c=sc.next().charAt(0);
		String st1=sc.next();
		sc.nextLine(); // ���⼭ Enter�� �Է¹ްԲ� �ϰ� �ٷ� �Ҹ��Ų��.
		String st2=sc.nextLine();  // Enter �Է� 
		
		System.out.println(st1);
		System.out.println(st2);
		
		// ������ ������ ������ ������ ��� �Է¹��� ��, ������ �Է°��� ����� ���� �ʾҴٸ�,
		// nextLine()�� ���� �ԷµǴ� Enter���� �������� �Ѵ�.
	}

}
