import java.util.Scanner;

public class ScanQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * [과제 문제]
		 * 1. 정수 1개를 입력 받은 후 출력
		 * 2. 문자열 1개를 입력 받은 후 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1개를 입력하세요 >> ");
		int num = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("문자열 1개를 입력하세요 >> ");
		String str = scan.nextLine();
		
		System.out.printf("입력한 정수 : %d \n입력한 문자열 : %s", num, str);
		
		scan.close();
	}
}
