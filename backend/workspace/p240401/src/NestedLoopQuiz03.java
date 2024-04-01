
public class NestedLoopQuiz03 {

	public static void main(String[] args) {
		/*
		 * [ 과제 문제 ]
		 * 중첩 for문을 사용하여, 아래와 같은 형태로 출력하세요.
		 * 100
		 * 010
		 * 001
		 */
		for ( int i = 0; i < 3; i++ ) {
			
			for ( int j = 0; j < 3; j++ ) {
				
				if ( i == j ) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
				
			}
			
			System.out.println();
		}
	}
	
}
