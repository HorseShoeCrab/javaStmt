package part1.array;

import java.util.Scanner;

public class ArrayLengthDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하세요");
		int[] intArr = new int[3];
		int sum=0;
		for(int i=0;i<intArr.length;i++){
			intArr[i] = scanner.nextInt();
		}
		for(int i=0;i<intArr.length;i++){
			sum += intArr[i];
		}
		System.out.println("입력받은 배열값의 합계는 "+ sum +"입니다");
	}
}
