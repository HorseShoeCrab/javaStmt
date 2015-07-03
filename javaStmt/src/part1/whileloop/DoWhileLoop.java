package part1.whileloop;
/*
 do ~ while 문은 while 문과 거의 일치하나
 다른 점은 처음 한 번은 무조건 수행하고 나서
 조건을 비교한다
 - 형식
 do{
 	문장;
 	}while(조건);
 */
public class DoWhileLoop {
	public static void main(String[] args) {
		int count = 1;
		/*do{}while();*/
		do{
			System.out.print(count+"\t");
			// ln 은 line 의 약자로 라인개행 명령어
			count++;
		}while(count < 11);
		System.out.println();
		
	}

}
