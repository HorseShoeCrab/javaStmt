package part1.test;

import java.util.Scanner;

public class ManOrWoman2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		String ssn ="", msg =""; // int �� �ʱ�ȭ�� 0; String �ʱ�ȭ�� ""
		ssn = scanner.next();
		
		// int Ÿ���� nextInt()
		// String Ÿ���� next()
		
		char ch = ssn.charAt(7); // ������ �ε��� ���� 0��� ���
		
		/*
		 �������� ���������� �Ǻ��ϴ� �κ��� �������� ���� 4�� �ش�
		 ��Ʈ�� ���ڿ��� �������� �ε������ �ϴµ�
		 0���� ����
		 �������� �ε��� 0���� 1�̰�
		 �ε��� 1���� 2
		 */
		// ����� : ������ ������ �ʴ� ���� ������ ���� ��� �׽�Ʈ���� ����غ��� ���
		System.out.println(ch);
		switch (ch) {
		case '1': case '2': msg = "����"; break;
		case '3': case '4': msg = "����"; break;
		case '5': case '6': msg = "�ܱ���"; break;
		default: msg = "�߸��� ��"; break;
		}
		System.out.println(msg);
	}
}
