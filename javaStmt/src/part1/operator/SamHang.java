package part1.operator;

public class SamHang {
	public static void main(String[] args) {
		int x = 1, y = 0, z = 0;
		boolean bool = false; // boolean �� �� ������
		z = bool ? x : y ;
		System.out.println("���׿����� ��� ��� : "+z);
		// bool �� true �� ��� x �� ���
		// bool �� false �� ��� y �� ���
		
		int flag = 10, flag2 = 20;
		boolean result = flag > flag2;
		String result2 = (result) ? "flag �� flag2 ���� Ů�ϴ�" : "flag �� flag2 ���� �۽��ϴ�." ;
		System.out.println(result2);
		// ���ϰ��� �������̸� ������� �ش��ϴ� ���� Ÿ���� int �� �ְ�
		// ���ϰ��� ���ͷ��̸� ������� �ش��ϴ� ���� Ÿ���� String �̶�� �Ѵ�
	}

}
