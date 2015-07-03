package part1.test;

import java.util.Scanner;

public class Notice2 {
	public static void main(String[] args) {
		int kor=0, eng=0, math=0, sum=0; // 지역변수는 초기화 필수
		double avg=0.0d; // 실수형은 더블타입으로 초기화
		String msg= ""; // 스트링 타입은 리터럴중에서 null로 초기화

		Scanner scanner = new Scanner(System.in);
		System.out.println("kor 의 값을 입력하세요");
		kor = scanner.nextInt();
		System.out.println("eng 의 값을 입력하세요");
		eng = scanner.nextInt();
		System.out.println("math 의 값을 입력하세요");
		math = scanner.nextInt();
		
		sum = kor+eng+math;
		avg = sum/3d; // double 형 주의
		/*
		 스캐너로 성적을 입력하면
		 합계에 따라 합격여부를 통지하는 프로그램
		 */
		
		/*
		 조건에 따라 결과값의 통지 내용이 달라짐
		 평균 100 점 보너스 지급
		 평균 70 이상 합격
		 평균 70 미만 불합격
		 */
		int key = (int) avg/10;
		switch (key) {
		case 10 : msg="보너스"; break;
		case 9:case 8:case 7: msg="합격"; break;
		/*
		case 9 : msg="합격"; break;
		case 8 : msg="합격"; break;
		case 7 : msg="합격"; break;
		*/
		default: msg="불합격"; break;
		}
		System.out.println(msg);
	}
}
