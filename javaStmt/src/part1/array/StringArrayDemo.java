package part1.array;

public class StringArrayDemo {
	public static void main(String[] args) {
		String[] arr; // String Ÿ���� �迭 ����
		arr = new String[3]; // �ε��� ������ �׻� �Է�
		
		double[] douArr;
		douArr = new double[3];
		
		arr[0] = "1";
		arr[1] = "2";
		arr[2] = "3";
		arr[3] = "4";
		
		for(int i=0;i<3;i++){
			System.out.println(arr[i]);
		}
		// java.lang.ArrayIndexOutOfBoundsException : �迭 �ʰ� ����
	}
}
