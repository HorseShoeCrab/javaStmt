package part1.array;

public class IntArrayDemo {
	public static void main(String[] args) {
		int sum=0;
		/* int[] arr; // 배열의 선언
		arr = new int[3]; // 배열의 객체 선언; 할당 아님 */
		int[] arr2 = new int[3];// 한 줄 선언과 객체 생성
		arr2[0] =1;
		arr2[1] =2;
		arr2[2] =3;
		for(int i=0;i<3;i++){
			sum += arr2[i];
		}
		System.out.println(sum);
		sum=0;
		int[] total = new int[10];
		total[0]=11;
		total[1]=12;
		total[2]=13;
		total[3]=14;
		total[4]=15;
		total[5]=16;
		total[6]=17;
		total[7]=18;
		total[8]=19;
		total[9]=20;
		
		for(int l=0;l<10;l++){
			sum += total[l];
		}
		System.out.println(sum);
	}
}










