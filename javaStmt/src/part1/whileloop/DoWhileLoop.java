package part1.whileloop;
/*
 do ~ while ���� while ���� ���� ��ġ�ϳ�
 �ٸ� ���� ó�� �� ���� ������ �����ϰ� ����
 ������ ���Ѵ�
 - ����
 do{
 	����;
 	}while(����);
 */
public class DoWhileLoop {
	public static void main(String[] args) {
		int count = 1;
		/*do{}while();*/
		do{
			System.out.print(count+"\t");
			// ln �� line �� ���ڷ� ���ΰ��� ���ɾ�
			count++;
		}while(count < 11);
		System.out.println();
		
	}

}