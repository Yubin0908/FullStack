import java.util.Scanner;

public class IfQuiz03 {
	
	public static void main(String[] args) {
		
		/*
		 * [ 문제 ]
		 * 사용자에게 정수 2개를 입력받은 후, 큰 값과 작은 값을 출력하시오.
		 * 
		 * << 입력 형태 >>
		 * 정수 2개를 입력하세요...
		 * 
		 * << 출력 형태 >>
		 * 큰값 : 9, 작은 값 : 7
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력하세요... ");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if ( num1 > num2 ) {
			System.out.printf("큰 값 : %d, 작은 값 : %d ", num1, num2);
		} else if ( num1 < num2 ) {
			System.out.printf("큰 값 : %d, 작은 값 : %d ", num2, num1);
		}
		
	}
}
