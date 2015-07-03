package part1.test;

import java.util.Scanner;

public class GetTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		
		
        // int time = 5000;
		int second=0, minute=0, hour=0;
		
		second = a % 60; // 500초를 60으로 나눈 나머지는 초
		minute = (a/60)%60;
		hour = a/3600;
		
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
	
	}
}
