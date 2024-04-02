
public class WhileQuiz03 {
	
	public static void main(String[] args) {
		/*
		 *  [ 과제 문제 ]
		 *  1 ~ 10까지 합을 구하시오.
		 *  [ 출력 형태 ]
		 *  1 ~ 10 누적합 : 55
		 */
		int sum = 0;
		int number = 0;
		
		while( number < 10 ) {
			number++;
			sum += number;
		}
		
		System.out.printf("1 ~ 10 누적합 : %d\n", sum);
		System.out.println("반복문 실행 후 number : " + number);
	}

}
