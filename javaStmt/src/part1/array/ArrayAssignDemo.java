package part1.array;

public class ArrayAssignDemo {
	public static void main(String[] args) {
		int[] intArr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		int sum = 0, sum2 = 0;
		for(int i=0;i<intArr.length;i++){
			sum += intArr[i];			
		}
		System.out.println(sum);
		
		// Ȯ���  for ��
		// �迭 ��½� ����Ʈ�� ���� �ʿ���� ��ü ����ϸ� ����Ʈ�� ���� ����
		for (int i : intArr) { 
			sum2 = i;
		}
		System.out.println(sum2);
	}
}
