package part1.test;

import java.util.Scanner;

public class ManOrWoman2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String ssn ="", msg =""; // int 형 초기화는 0; String 초기화는 ""
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
		// 디버깅 : 에러나 원하지 않는 값이 나오지 않을 경우 테스트값을 출력해보는 경우
		System.out.println(ch);
		switch (ch) {
		case '1': case '2': msg = "남자"; break;
		case '3': case '4': msg = "여자"; break;
		case '5': case '6': msg = "외국인"; break;
		default: msg = "잘못된 값"; break;
		}
		System.out.println(msg);
	}
}
