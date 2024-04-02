import java.util.Scanner;

public class NestedLoopQuiz04 {
	
	public static void main(String[] args) {
		/* [ 과제 문제 ]
		 * 짝수 단과 홀수 단을 출력하시오.
		 * - 사용자가 0을 입력하면 짝수단 출력,
		 * - 사용자가 1을 입력하면 홀수단을 출력.
		 * [ 입력 형태 ]
		 * 짝수 단은 0, 홀수 단은 1을 입력하세요. . . 1
		 * 
		 * [ 출력 형태 ]
		 * 3 * 1 = 3
		 *     . . . 
		 * 5 * 1 = 5
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("짝수 단은 0, 홀수 단은 1을 입력하세요. . . : ");
		
		int user = scan.nextInt();
		
		if ( user == 0 ) { // 사용자가 0 입력, 짝수 단 출력
			for ( int i = 2 ; i < 10; i += 2 ) {
				for( int j = 1; j < 10; j++ ) {
					System.out.printf("%d * %d = %d\n", i, j , (i * j) );
				}
				System.out.println();
			}
		} else if ( user == 1 ) { // 사용자가 1 입력, 홀수 단 출력
			for ( int i = 3 ; i < 10; i += 2 ) {
				for( int j = 1; j < 10; j++ ) {
					System.out.printf("%d * %d = %d\n", i, j , (i * j) );
				}
				System.out.println();
			}
		} 
		
		scan.close();
		
	}

}
