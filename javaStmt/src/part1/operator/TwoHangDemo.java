package part1.operator;
/*
 *Demo.java �̸��� ���̸� 
 Demo �� ���üҽ��� ���ϴ� ���̻��̹Ƿ�
 ���üҽ��� ������ Ŭ������� �ν��ϸ� �ȴ�
 */
public class TwoHangDemo {
	public static void main(String[] args) {
		// ������ȣ�� *, �������� �� ���ϴ� ��ȣ�� /, �������� ������ ���ϴ� ��ȣ�� %
		// ���� ��ȣ�� +, ���� ��ȣ�� - �� ��
		// ���� ������ gob, �������� �� ������ mok, �������� ������ ������ nmg, ������ sub
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
