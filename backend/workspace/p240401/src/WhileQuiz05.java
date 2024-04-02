import java.util.Scanner;

public class WhileQuiz05 {

	public static void main(String[] args) {
		/*
		 * [ 과제 문제 ]
		 * 사용자에게 정수를 입력받은 후, 누적합 출력
		 * [ 입력 형태 ]
		 * 정수를 입력하세요(종료 -1 입력) >> 2
		 * 정수를 입력하세요(종료 -1 입력) >> 3
		 * 정수를 입력하세요(종료 -1 입력) >> -2
		 * 정수를 입력하세요(종료 -1 입력) >> 7
		 * 정수를 입력하세요(종료 -1 입력) >> -1
		 * [ 출력 형태 ]
		 * 총 합 >> 10
		 */
		Scanner scan = new Scanner(System.in);
		
		// 누적합 변수
		int sum = 0;
		// 사용자 입력 변수
		int user = 0;
		
		while ( true ) {
			System.out.print("정수를 입력하세요(종료 -1 입력)");
			user = scan.nextInt();
			
			if ( user == -1 )
				break;
			
			sum += user;
		}

		System.out.printf("총 합 >> %d", sum);
		
		scan.close();
	}
	
}
