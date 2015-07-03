package part1.array;

public class ArrayAssignDemo {
	public static void main(String[] args) {
		int[] intArr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		int sum = 0, sum2 = 0;
		for(int i=0;i<intArr.length;i++){
			sum += intArr[i];			
		}
		System.out.println(sum);
		
		// 확장된  for 문
		// 배열 출력시 리미트값 정할 필요없이 전체 출력하면 리미트값 생략 가능
		for (int i : intArr) { 
			sum2 = i;
		}
		System.out.println(sum2);
	}
}
