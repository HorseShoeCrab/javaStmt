package part1.array;

public class ForLoopAssign {
	public static void main(String[] args) {
		int[] intArr = new int[10];
		int sum=0;
		for(int i=0;i<intArr.length;i++){
			intArr[i] = i+1; // ���� ������ �ּ�ȭ
			sum += intArr[i];
		}
		System.out.println(sum);
	}
}
