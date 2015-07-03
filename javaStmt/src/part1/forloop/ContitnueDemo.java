package part1.forloop;

import java.util.Scanner;

// 1부터 입력값 사이의 짝수의 합을 구하는 프로그램
public class ContitnueDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 부터 합산하고자 하는 범위의 값을 입력하세요");
		System.out.println("범위내의 짝수만 합산됩니다");
		int num = scanner.nextInt(),sum=0;
		for (int i=1;i<=num;i++){
			if (i%2==1) { // 홀수
				continue; // 더하지 않고 다음으로 이동
			} else { // 짝수
				sum += i;
			}
		}
		System.out.println("짝수의 합 :"+sum);
	}
}
