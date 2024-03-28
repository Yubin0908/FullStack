import java.util.Scanner;

public class ScanQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * [과제 문제]
		 * 사용자에게 정수 2개를 입력받은 후, 큰 값만 출력
		 * <출력문구>
		 * 서로 다른 정수 2개를 입력하세요 >>
		 * 큰 값 >>
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("서로 다른 정수 2개를 입력하세요 >> ");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int max = (num1 > num2) ? num1:num2;
		
		System.out.printf("큰 값 >> " + max);
		
		scan.close();
	}
}
