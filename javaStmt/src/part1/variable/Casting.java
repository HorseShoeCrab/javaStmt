package part1.variable;
/*
 Casting (����ȯ) 
 UpCasting (������ �ڵ���ȯ) 
 - ������ Ÿ���� ũ�Ⱑ ���� �ʿ��� -> ū ������ ������ �̵���
 DownCasting (������ ������ȯ)
 - ������ Ÿ���� ũ�Ⱑ ū �ʿ��� -> ���� ������ �̵���
 */
public class Casting {
	public static void main(String[] args) {
		int varInt = 100;
		double varDouble = 123.456d;
	//	varDouble = varInt; // ��ĳ����
		System.out.println("����Ÿ�� ������ ��� : "+varDouble);
		varInt = (int) varDouble; // �ٿ�ĳ����
		System.out.println("�ٿ�ĳ���� �� ����� : "+varInt);
		/*
		 ��Ŭ������ fix available �ϴٸ鼭 �ִ� �������� ����� 
		 "��Ŭ���� ���� (eclipse Proposal)" �̶�� �ϸ�
		 �� ��Ŭ���� ������ ���� ������ �����ϵ��� �Ѵ�
		 */
		/*
		 ��, �ٿ�ĳ���� �� ���� ������ �ս�(data loss) �� �Ͼ��
		 */

	}

}