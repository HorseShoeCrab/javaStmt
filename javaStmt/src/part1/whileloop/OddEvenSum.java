package part1.whileloop;

public class OddEvenSum {
	public static void main(String[] args) {
		int num=1, sum =0, oddSum=0, evenSum=0;// 지역변수는 초기화 필수
		while(num<=10){
			sum += num; // sum = sum + num;
			num++;
		}
		System.out.println(sum);
			sum = 0;
		for(num=0;num<=10;num++){
			sum += num;
		}
			System.out.println(sum);
		/*
		 홀수, 짝수의 합	
		 */
		num=1;
		while(num<=10){
			oddSum += num;
			num += 2; // num = num + 2;
		}
		System.out.println(oddSum);
		
		for(num=0;num<=10;num+=2){
			evenSum += num;
		}
		System.out.println(evenSum);
		oddSum=0; 
		evenSum=0;
		for(num=1;num<=10;num++){
			if(num%2==1){
				oddSum += num;
			}
			if(num%2==0){
				evenSum += num;
			}
		}
		System.out.println("두 번째 홀수 합 :"+oddSum);
		System.out.println("두 번째 짝수 합 :"+evenSum);
	}
}