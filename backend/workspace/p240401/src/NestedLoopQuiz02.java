
public class NestedLoopQuiz02 {

	public static void main(String[] args) {
		/*
		 * [ 과제 문제 ]
		 * 중첩 while문을 사용하여 2단 ~ 9단 까지 출력
		 * [ 출력 형식 ]
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 		. . . 
		 * 2 * 9 = 18
		 * 
		 * 3 * 1 = 3
		 */
		int i = 2;
		
		while ( i < 10 ) {
			
			int j = 1;
			
			while ( j < 10 ) {
				
				System.out.printf(" %d * %d = %d\n", i, j, ( i * j ));
				j++;
			}
			
			System.out.println();
			i++;
		}
	}
	
}
