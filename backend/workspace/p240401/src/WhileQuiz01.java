
public class WhileQuiz01 {
	public static void main(String[] args) {
		/*
		 * [ 과제 문제 ]
		 * while문을 사용하여, 1~10까지 출력
		 * [ 출력 형태 ]
		 * 1 2 3 4 5 6 7 8 9 10
		 */
		int number = 0;
		
		while (number < 10) {
			// number++;
			// System.out.print( number + " " );
			System.out.printf("%d ", ++number);
		}
	}
}
