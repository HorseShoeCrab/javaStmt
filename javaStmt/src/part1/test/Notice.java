package part1.test;

import java.util.Scanner;

public class Notice {
	public static void main(String[] args) {
		int kor=0, eng=0, math=0, sum=0; // ���������� �ʱ�ȭ �ʼ�
		double avg=0.0d; // �Ǽ����� ����Ÿ������ �ʱ�ȭ
		String msg= ""; // ��Ʈ�� Ÿ���� ���ͷ��߿��� null�� �ʱ�ȭ

		Scanner scanner = new Scanner(System.in);
		System.out.println("kor �� ���� �Է��ϼ���");
		kor = scanner.nextInt();
		System.out.println("eng �� ���� �Է��ϼ���");
		eng = scanner.nextInt();
		System.out.println("math �� ���� �Է��ϼ���");
		math = scanner.nextInt();
		
		sum = kor+eng+math;
		avg = sum/3d; // double �� ����
		/*
		 ��ĳ�ʷ� ������ �Է��ϸ�
		 �հ迡 ���� �հݿ��θ� �����ϴ� ���α׷�
		 */
		
		/*
		 ���ǿ� ���� ������� ���� ������ �޶���
		 ��� 100 �� ���ʽ� ����
		 ��� 70 �̻� �հ�
		 ��� 70 �̸� ���հ�
		 */
		if(avg==100){
			msg = "���ʽ� ����"; // System.out.println("���ʽ� ����"); �� ��ü����
		}else if(avg>=70){
			msg = "�հ�"; // System.out.println("�հ�"); �� ��ü����
		}else{
			msg = "���հ�"; // System.out.println("���հ�"); �� ��ü����
		}
		System.out.println(msg);
	}
}
