package part1.array;

public class StringArrayDemo {
	public static void main(String[] args) {
		String[] arr; // String 타입의 배열 선언
		arr = new String[3]; // 인덱스 사이즈 항상 입력
		
		double[] douArr;
		douArr = new double[3];
		
		arr[0] = "1";
		arr[1] = "2";
		arr[2] = "3";
		arr[3] = "4";
		
		for(int i=0;i<3;i++){
			System.out.println(arr[i]);
		}
		// java.lang.ArrayIndexOutOfBoundsException : 배열 초과 에러
	}
}
