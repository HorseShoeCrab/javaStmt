package part1.whileloop;

import java.util.Scanner;

public class BreakDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���Ϸ��� �������� �Է��ϼ���");
		System.out.println("���߽÷��� -1 �� �Է��ϼ���");
		
		int num=0, sum=0;
		while (true) { // while �� condition �� true ���� �ָ� ���ѷ��� ����
			num=scanner.nextInt();
			if (num == -1){
				break; // -1 �� �ԷµǸ� �ݺ� ����
			}
			sum += num;
		}
		System.out.println("�հ� :"+sum);
	}
}
