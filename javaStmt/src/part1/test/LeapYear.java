package part1.test;

import java.util.Scanner;

// �������
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�⵵�� �Է��Ͻÿ�");
		int year = scanner.nextInt();;
		String msg = "";
		if(year % 400 == 0){
			msg = "����";
		}else if(year % 100 == 0){
			msg = "���";
		}else if(year % 4 == 0){
			msg = "����";
		}else{
			msg = "���";
		} // ���͸� ����� ������� ũ�� �ִ� �������� ���� �������� ����
		System.out.println(msg);
		
		scanner.close();
	}
}
