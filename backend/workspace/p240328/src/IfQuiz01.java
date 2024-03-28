import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * [ 문제 ]
		 * 정수 1개를 입력받은 후, 0 인지 아닌지를 출력
		 * - 입력 문구 : 정수 하나를 입력하세요 >>
		 * - 출력 문구 : 입력한 숫자는 0입니다. or 입력한 숫자는 0이 아닙니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요 >> ");
		
		int num = scan.nextInt();
		
		if ( num == 0 ) {
			System.out.println("입력한 숫자는 0입니다.");
		} else {
			System.out.println("입력한 숫자는 0이 아닙니다.");
		}
		
		scan.close();
	}
}
