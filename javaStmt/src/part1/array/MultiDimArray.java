package part1.array;
// 5씩 증가하는 정방향 메트릭스 모델
public class MultiDimArray {
	public static void main(String[] args) {
		int[][] fiveMatrix = new int[5][5];
		int k = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				k += 5;
				fiveMatrix[i][j] = k;
				System.out.print(fiveMatrix[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}
