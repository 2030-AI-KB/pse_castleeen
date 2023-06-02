package pse_0414;

import java.util.Scanner;
public class double_repeat {
	public static void main(String[] args) {
		// 2중 반복문
		Scanner sc=new Scanner(System.in);
		
		// 예제 :: 4명 학생의 국영수 점수를 입력받고 각 학생의 성적 평균을 내어라.
		// 학생을 행으로 취급, 과목을 열로 취급
		int score[][]=new int [4][3]; // 학생의 수 4, 국영수 과목의 갯수 3
		for(int i=0;i<4;i++) { // i가 0번부터 3번까지
			for(int k=0;k<3;k++) { //k가 0번부터 2번까지
				score[i][k]=sc.nextInt();
		}	
	}
		// 2. 각 학생의 성적 평균 연산
		for(int i=0;i<4;i++) { // i가 0번부터 3번까지
			// (1) 합계 구하기
			int sum=0;
			for(int k=0;k<3;k++) { //k가 0번부터 2번까지
				sum+=score[i][k];  // 특정 학생의 국영수 점수 덧셈 연산\
			}
			//여기 까지 오면, i번째 학생의 국영수 합계가 sum에 저장되어있음
			
			// (2) 평균을 내어서 바로 출력 
			double avg=(double)sum/3;
			//double avg=sum/3.0; 도 된다
			System.out.println((char)(i+'A')+"번째 학생의 평균은"+avg);				
		}	
	}
}
	
