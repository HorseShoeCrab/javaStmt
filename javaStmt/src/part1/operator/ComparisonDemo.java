package part1.operator;
//if(){} if�� �� Ű����, () �񱳽��� ��ġ�ϴ� �����, {} ���ǹ� �ٵ�
public class ComparisonDemo {
	public static void main(String[] args) {
		int val01 = 1, val02 = 2;
		
		if(val01 == val02){ // val01 �� val02 �� ���� ���Ƹ�
			System.out.println("val01 �� val02 ���� ����");
		}else
		if(val01 != val02){// val01 �� val02 �� ���� �ٸ��ٸ�
			System.out.println("val01 �� val02 ���� �ٸ���");
		}else
		if(val01 > val02){// val01 �� val02 ���� ũ�ٸ�
			System.out.println("val01 �� val02 ���� ũ��");
		}else
		if(val01 < val02){// val01 �� val02 ���� �۴ٸ�
			System.out.println("val01 �� val02 ���� �۴�");
		}
	}
}
	