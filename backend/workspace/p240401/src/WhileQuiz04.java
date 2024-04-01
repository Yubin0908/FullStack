import java.util.Scanner;

public class WhileQuiz04 {

	public static void main(String[] args) {
		/*
		 * [ 과제 문제 ]
		 * 1 ~ 10 사이의 정수 1개를 입력받은 후, 랜덤값은 만들어 사용자가 입력한 정수를 맞추기
		 * 사용자 입력값이랑 컴퓨터 입력값과 맞을 때 까지
		 * [ 입력 형태 ]
		 * 1 ~ 10 사이의 정수 1개를 입력 >> 3
		 * [ 출력 형태 ]
		 * 7 1 8 7 3
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1 ~ 10 사이의 정수 1개를 입력 >> ");
		int user = scan.nextInt();
		
		int computer = 0;
		
		while ( user != computer ) {
			computer = (int)(Math.random() * 10) + 1;
			System.out.print(computer + " ");
		}
		
		scan.close();
	}
	
}
