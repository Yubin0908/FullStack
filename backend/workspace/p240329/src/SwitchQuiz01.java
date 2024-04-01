import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * [ 문 제 ]
		 * 월을 입력받은 후, 계절을 출력하시오.
		 * << 입력 형태 >>
		 * 월을 하세요...
		 * 
		 * << 출력 형태 >>
		 * 계절은 ㅁ 입니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하세요.");
		
		int month = scan.nextInt();
		
		switch ( month ) {
			case 12, 1, 2 : 
				System.out.println("계절은 겨울입니다.");
				break;
			case 3, 4, 5 :
				System.out.println("계절은 봄입니다.");
				break;
			case 6, 7, 8 :
				System.out.println("계절은 여름입니다.");
				break;
			case 9, 10, 11 :
				System.out.println("계절은 가을입니다.");
				break;
		}
	}
}
