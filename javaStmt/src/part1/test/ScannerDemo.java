package part1.test;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		/*
		 스캐너 클래스의 객체인 scanner 를 생성하였다.
		 */
		// Scanner scanner = new Scanner(System.in);
		// Scanner scanner = new Scanner(System.in);
		// Scanner scanner = new Scanner(System.in);
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		int a = scanner.nextInt();
		System.out.println(a);
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		int b = scanner.nextInt();
		int a = 0;
		for(int i=0;i<=b;i++){
			a += i;
		}
		System.out.println(a);
		
		
		
	}

}
