package pse_0417;

import java.util.Scanner;

public class function_test {
	//문제 현재 시각을 입력받고 아래의 함수를 실행하게끔 하여라
	//1) clock() :: 현재 시각(시, 분, 초)을 전달받아 양식대로 출력하는 함수
	static void clock(int hour, int min, int sec) {
		// 시, 분, 초에 대한 정보 전달 -> 매개변수를 3개로 선언

		System.out.println("현재시간은" + hour+"시 "+min+"분 "+sec+"초입니다.");
		
	}
	//2) ap() :: 현재가 오전인지 오후인지 출력하는 함수
	static void ap(int hour) {
		if(hour<12) {
			System.out.println("현재는 오전입니다.");
		}
		else {	//"시 정보가 12보고 크거나 작거나"
			System.out.println("현재는 오후입니다.");
		}
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	//1. 시, 분, 초에대한 정보 입력받기
	//void를 반환용으로 선언할때에는  return문 사용 X
	int h=sc.nextInt();
	int m=sc.nextInt();
	int s=sc.nextInt();
	
	//2. 현재 시각 출력하는 함수 호출(참조)
	clock(h,m,s);
	
	//3. 오전인지 오후인지를 출력하는 함수 호출(참조)
	ap(h);

}
}
