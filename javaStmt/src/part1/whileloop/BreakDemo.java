package part1.whileloop;

import java.util.Scanner;

public class BreakDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("더하려는 정수값을 입력하세요");
		System.out.println("멈추시려면 -1 을 입력하세요");
		
		int num=0, sum=0;
		while (true) { // while 값 condition 에 true 값을 주면 무한루프 구문
			num=scanner.nextInt();
			if (num == -1){
				break; // -1 이 입력되면 반복 종료
			}
			sum += num;
		}
		System.out.println("합계 :"+sum);
	}
}
