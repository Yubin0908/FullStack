import java.util.Scanner;

public class IfQuiz02 {
	
	public static void main(String[] args) {
		/*
		 * [ 문제 ]
		 * 성별 1 or 2를 입력받은 후, '남자입니다', 또는 '여자입니다'를 출력하시오.
		 * 1, 2, 3, 4 이외의 값을 입력했을 경우,
		 * '잘못된 값을 입력했습니다.'를 출력하시오.
		 * 
		 * << 출력형식 >>
		 * 남자입니다. or 여자입니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성별(1, 2, 3, 4)을 입력하세요. ");
		
		int num = scan.nextInt();
		
		if ( num == 1 || num == 3 ) {
			System.out.println("남자입니다.");
		} else if ( num == 2 || num == 4 ) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("잘못된 값을 입력했습니다.");
		}
		
		scan.close();
	}
}
