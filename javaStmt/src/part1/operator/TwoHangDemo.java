package part1.operator;
/*
 *Demo.java 이름이 보이면 
 Demo 는 샘플소스를 뜻하는 접미사이므로
 샘플소스를 구현한 클래스라고 인식하면 된다
 */
public class TwoHangDemo {
	public static void main(String[] args) {
		// 곱셈기호는 *, 나눗셈의 몫 구하는 기호는 /, 나눗셈의 나머지 구하는 기호는 %
		// 덧셈 기호는 +, 뺄셈 기호는 - 일 때
		// 곱셈 변수는 gob, 나눗셈의 몫 변수는 mok, 나눗셈의 나머지 변수는 nmg, 뺄셈은 sub
		/*int x = 20;
		int y = 7;
		int add = 0;
		add = x + y;
		int sub = 0;
		sub = x - y;
		int gob = 0;
		gob = x * y;
		int mok = 0;
		mok = x / y;
		int nmg = 0;
		nmg = x % y;*/
		int add, sub, gob, mok, nmg;
		int x = 20;
		int y = 7;
		add = x + y;
		sub = x - y;
	    gob = x * y;
	    mok = x / y;
	    nmg = x % y;
		System.out.println("x + y = "+add+"\n"+"x - y = "+sub+"\n"+"x * y = "+gob+"\n"+"x / y= "+mok+"\n"+"x % y = "+nmg);
	}
}
