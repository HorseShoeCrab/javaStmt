package part1.test;

import java.util.Scanner;

// 윤년계산기
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도를 입력하시오");
		int year = scanner.nextInt();;
		String msg = "";
		if(year % 400 == 0){
			msg = "윤년";
		}else if(year % 100 == 0){
			msg = "평년";
		}else if(year % 4 == 0){
			msg = "윤년";
		}else{
			msg = "평년";
		} // 필터링 방식은 결과값을 크개 주는 범위부터 작은 방향으로 진행
		System.out.println(msg);
		
		scanner.close();
	}
}
