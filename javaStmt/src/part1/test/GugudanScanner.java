package part1.test;

import java.util.Scanner;

public class GugudanScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력할 단을 입력하시오");
		int dan = scanner.nextInt();
		int k = 0;
		if(dan>1){
			for(int i=1;i<10;i++){
				System.out.println(dan+ "*" +i+ "=" +dan*i);
				
			}
		}
			
	}
}

