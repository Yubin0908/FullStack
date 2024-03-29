import java.util.Scanner;

public class SwitchQuiz01Refactoring {

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
		String season = "";
		
		switch ( month ) {
			case 12 : case 1 : case 2 : 
				season = "겨울";
				break;
			case 3 : case 4 : case 5 :
				season = "봄";
				break;
			case 6 : case 7 : case 8 :
				season = "여름";
				break;
			case 9 : case 10 : case 11 :
				season = "가을";
				break;
			default :
				System.out.println("월을 잘못 입력하셧습니다. 잘못입력한 월 : " + month);
		}
		
		System.out.printf("계절은 %s입니다.", season);
		
		scan.close();
	}
}
