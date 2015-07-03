package part1.test;

import java.util.Scanner;

public class Kaup {
	public void testMethod(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하게요");
		double weight = scanner.nextDouble();
		
		int idx= (int) ((weight/(height*height))*10000); // double 타입의 결과물을 int 타입의 변수에 할당 -> 캐스팅 발생
		String msg = "";
		if (idx>30){
			msg = "비만";
		}else if(idx>24){
			msg = "과체중";
		}else if(idx>20){
			msg = "정상";
		}else if(idx>15){
			msg = "저체중";
		}else if(idx>13){
			msg = "마름";
		}else if(idx>10){
			msg = "영양실조";
		}
		System.out.println();
		System.out.println("키 = "+height+"\n몸무게 = "+weight+"\n카우프지수 = "+msg);
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		Kaup kaup =new Kaup();
		kaup.testMethod();
	}
}
