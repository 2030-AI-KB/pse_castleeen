package pse_0411;

import java.util.Scanner;


public class test_2 {
	public static void main(String[] args)  {
		// -> 정수를 2개 입력받고 
		
		Scanner sc=new Scanner(System.in);

		int n1, n2;
		n1=sc.nextInt();	//첫번째 정수 입력받기
		n2=sc.nextInt();	//두번째 정수 입력받기
		
		
		
		// -> 사칙연산의 결과를 출력하세요
		System.out.println("덧셈결과: "+(n1+n2));
		System.out.println("뺄셈결과: "+(n1-n2));
		System.out.println("곱셈결과: "+(n1*n2));
		System.out.println("몫 나눗셈결과: "+(n1/n2));
		System.out.println("나머지 나눗셈결과: "+(n1%n2));

		
		
		
		
		
		
}
}