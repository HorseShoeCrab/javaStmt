package part1.test;

import java.util.Scanner;

public class ManOrWoman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String ssn =""; // int 형 초기화는 0; String 초기화는 ""
		ssn = scanner.next();
		
		// int 타입은 nextInt()
		// String 타입은 next()
		
		char ch = ssn.charAt(7); // 적당한 인덱스 값은 0대신 대신
		
		/*
		 남자인지 여자인지를 판별하는 부분은 예문에서 위의 4에 해당
		 스트링 문자열의 순서값은 인덱스라고 하는데
		 0부터 시작
		 예문에서 인덱스 0값은 1이고
		 인덱스 1값은 2
		 */
		if(ch=='1'||ch=='3'){ // char 타입은 '' 이고 string 타입은 ""
			System.out.println("남자");
		}else if(ch=='2'||ch=='4'){
			System.out.println("여자");
		}else if(ch=='5'||ch=='6'){
			System.out.println("외국인");
		}else{
			System.out.println("잘못된 값");
		}
	}
}
