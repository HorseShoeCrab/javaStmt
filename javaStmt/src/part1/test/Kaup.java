package part1.test;

import java.util.Scanner;

public class Kaup {
	public void testMethod(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϰԿ�");
		double weight = scanner.nextDouble();
		
		int idx= (int) ((weight/(height*height))*10000); // double Ÿ���� ������� int Ÿ���� ������ �Ҵ� -> ĳ���� �߻�
		String msg = "";
		if (idx>30){
			msg = "��";
		}else if(idx>24){
			msg = "��ü��";
		}else if(idx>20){
			msg = "����";
		}else if(idx>15){
			msg = "��ü��";
		}else if(idx>13){
			msg = "����";
		}else if(idx>10){
			msg = "�������";
		}
		System.out.println();
		System.out.println("Ű = "+height+"\n������ = "+weight+"\nī�������� = "+msg);
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		Kaup kaup =new Kaup();
		kaup.testMethod();
	}
}
