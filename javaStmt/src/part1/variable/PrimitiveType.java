package part1.variable;
/*
 �⺻�� Ÿ�� 8����
 1.���� (����Ʈ)
 boolean - 1byte
 
 2.����Ʈ (1����Ʈ)
 byte - 1byte
 
 3.���� (2����Ʈ)
 char - 2byte
 
 4.���� (2,4,8 ����Ʈ)
 short - 2 byte
 int - 4 byte
 long - 8 byte
 
 5.�Ǽ� (4,8����Ʈ)
 float - 4 byte
 double - 8 byte
 */
public class PrimitiveType {
	public static void main(String[] args) {
		// ���� 1 ����Ʈ, �ʱⰪ : false;
		boolean result = true;
		// ������, char : 2 ����Ʈ, �ʱⰪ = \u0000
		char c = 'C'; // ���ĺ� �� ���ڸ� ��Ÿ���� ��ҹ��ڸ� ����	
		// ������
		byte varByte = 100; // (8��Ʈ)
		short varShort = 10000; // (16��Ʈ)
		int varInt = 10000000;// (32��Ʈ)
		long varLong = 100L; // (64��Ʈ) ���ڰ� ������ ���ĺ� �� �Ǵ� ���� ǥ����. �ٸ� �� ���ٴ� �� �� ��õ
		// �Ǽ��� = �ε��Ҽ��� Ÿ��
		float varFloat = 100.00f; // (32��Ʈ) ���ڰ� �ڿ� F �Ǵ� f�� ǥ����
		double varDouble = 100.00d; // (64��Ʈ) ���ڰ� �ڿ� D �Ǵ� d�� ǥ����
		
		// 1����Ʈ = 8 ��Ʈ
		// 1��Ʈ = ���� 0 �� 1�� ����
		
		/*
	      �޸� �뷮�� �þ ������
	    boolean, int, double
		 * */
		double a = 3.14d;
		System.out.println("a�� 3.14�� ����� �� : "+a);
	}
}
