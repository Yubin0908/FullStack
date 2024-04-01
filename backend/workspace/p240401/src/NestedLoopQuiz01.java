
public class NestedLoopQuiz01 {

	public static void main(String[] args) {
		/*
		 * [ 과제 문제 ]
		 * 중첩 for문을 사용하여 2단 ~ 9단 까지 출력
		 * [ 출력 형식 ]
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 		. . . 
		 * 2 * 9 = 18
		 * 
		 * 3 * 1 = 3
		 */
		for ( int i = 2; i < 10; i++ ) {
			
			for ( int j = 1; j < 10; j++ ) {
				System.out.printf(" %d * %d = %d\n", i, j, ( i * j));
			}
			
			System.out.println();
		}
	}
	
}
