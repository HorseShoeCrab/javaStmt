package part1.array;

import java.util.Scanner;

public class ArrayLengthDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3���� ���ڸ� �Է��ϼ���");
		int[] intArr = new int[3];
		int sum=0;
		for(int i=0;i<intArr.length;i++){
			intArr[i] = scanner.nextInt();
		}
		for(int i=0;i<intArr.length;i++){
			sum += intArr[i];
		}
		System.out.println("�Է¹��� �迭���� �հ�� "+ sum +"�Դϴ�");
	}
}
