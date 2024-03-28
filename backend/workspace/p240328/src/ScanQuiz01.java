import java.util.Scanner;

public class ScanQuiz01 {

	public static void main(String[] args) {
		/*
		 * [문제] 정수 2개를 입력 받은 후, 덧셈 결과를 출력하시오.
		 * 출력 문구 : 정수 2개를 입력하세요...
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력하세요...");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.printf("결과 : %d", (num1 + num2));
		
		scan.close();
	}
}
