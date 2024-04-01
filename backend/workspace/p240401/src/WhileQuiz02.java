
public class WhileQuiz02 {
	
	public static void main(String[] args) {
		/*
		 * [ 과제 문제 ]
		 * 2단을 출력하시오.
		 * [ 출력 형태 ]
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 */
		int number = 0;
		
		while ( number < 9 ) {
			number++;
			System.out.printf("2 * %d = %d\n", number, (2 * number));
		}
	}

}
