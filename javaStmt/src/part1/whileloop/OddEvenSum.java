package part1.whileloop;

public class OddEvenSum {
	public static void main(String[] args) {
		int num=1, sum =0, oddSum=0, evenSum=0;// ���������� �ʱ�ȭ �ʼ�
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
		 Ȧ��, ¦���� ��	
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
		System.out.println("�� ��° Ȧ�� �� :"+oddSum);
		System.out.println("�� ��° ¦�� �� :"+evenSum);
	}
}