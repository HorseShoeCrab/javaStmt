package part1.test;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		/*
		 ��ĳ�� Ŭ������ ��ü�� scanner �� �����Ͽ���.
		 */
		// Scanner scanner = new Scanner(System.in);
		// Scanner scanner = new Scanner(System.in);
		// Scanner scanner = new Scanner(System.in);
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���");
		int a = scanner.nextInt();
		System.out.println(a);
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���");
		int b = scanner.nextInt();
		int a = 0;
		for(int i=0;i<=b;i++){
			a += i;
		}
		System.out.println(a);
		
		
		
	}

}
