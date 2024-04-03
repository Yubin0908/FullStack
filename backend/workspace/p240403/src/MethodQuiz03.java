// 문제

import java.util.Scanner;

public class MethodQuiz03 {
	// 메서드 정의
	// - 기능 : 정수하나를 입력받은 후, 팩토리얼 출력
	// - 메소드명 : factorial, 매개변수 : 1개, 리턴값 : 없음
	// - 출력형태 : 5! = 120
	public static void factorial(int num) {
		int sum = 1;
		
		for(int i = 1; i <= num; i++) {
			sum *= i;
		}
		
		System.out.printf("%d! = %d\n", num, sum);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1개 입력 >> ");
		int num = scan.nextInt();
		
		// 메소드 호출
		factorial(num);
	}
}
