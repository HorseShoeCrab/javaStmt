package part1.test;

import java.util.Scanner;

public class GetTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		
		
        // int time = 5000;
		int second=0, minute=0, hour=0;
		
		second = a % 60; // 500�ʸ� 60���� ���� �������� ��
		minute = (a/60)%60;
		hour = a/3600;
		
		System.out.println(hour + "��");
		System.out.println(minute + "��");
		System.out.println(second + "��");
	
	}
}
