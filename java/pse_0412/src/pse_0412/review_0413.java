package pse_0412;

import java.util.Scanner;

public class review_0413 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
	
	//연산자 :: 
	//산술연산자 :: +,-,*,/,%
	//대입연산자 :: = 
	// **복합대입연산자 :: +=, -=, *=, /=, %=	
		
//		int num=5;
//		System.out.println("num의 초기값" +num);
//		num+=3;
//		System.out.println("num+=3의 결과: "+num);
//		num-=3;
//		System.out.println("num-=3의 결과: "+num);
//		num/=3;
//		System.out.println("num/=3의 결과: " +num);
//		num*=3;
//		System.out.println("num*=3의 결과: " +num);

	//비교연산자 :: <, <=, >,>=, ==(같다), !(다르다)
	//논리연산자 :: &&("그리고"), ||("또는")
	//중감연산자 :: ++, --
	
	

	//조건문 :: if - else if - else, switch

//		while(조건문) {
//			조건문을 만족할 때 마다 반복하는 명령문
//		}
//		
		
	//반복문 :: for, while + do while
//	
//	do {
//		실행할 명령문
//	}while(조건문);

		
		int var=1;
		do {
			System.out.println(var);
			var++;
		}while(var<=10);
		
		int var=1;
		do {
			System.out.println(var);
			var++;
		}while(false);
		// 조건문, 반복문의 조건식에 true를 적을 때엔, 조건에 상관없이 실행
		// 조건문, 반복문의 조건식에 false를 적을때 엔, 조건에 상관없이 실행X

		
}
}