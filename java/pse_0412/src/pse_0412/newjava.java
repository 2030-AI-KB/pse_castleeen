package pse_0412;

public class newjava {
	public static void main(String[] args) {
		// 반복문 :: 특정조건을 만족할 때 마다 명령문을 반복하는 구문
		// 종류 :: for / while / do while
		// 반복문을 설계할 때에는, 반드시 실행의 끝이 존재하게끔 해야함.
		
		
		// 제어변수 :: 반복문의 실행을 제어하는 역할
//		for(제어변수(v) 선언; 조건문;v에 대한 연산(중감연산자를 많이쓴다)) {
//			조건문을 만족할 시 반복할 명령문
//		}
		
		// ()안은 , 조건문을 제외하고 모두 생략가능
		
		// 예제: 1부터 10까지 출력하는 프로그램
				//while문 사용
//				while(조건문) { 
//					조건문을 만족할때마다 반복할 명령문
//				}
				// 중감연산자 :: ++, --
		
		int n=1; 
		while(n<=10)    {
			// 반복할 명령문 :: n을 1씩 증가, 출력문 
			System.out.println(n);
			n++; 		// n=n+1;	
		}
		
		for(int num=1; num<=10; num++)			{
			System.out.println(num);
		}
		
		
	}
}
