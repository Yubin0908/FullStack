import java.util.Scanner;

public class IfQuiz04Refactoring {
	
	public static void main(String[] args) {
		/*
		 * [ 문제 ]
		 * 점수를 입력받은 후, 학점을 출력하시오.
		 * 90 ~ 93 : A- / 94 ~ 96 : A0 / 97 ~ 100 : a+
		 * 80 ~ 83 : B0 / 84 ~ 86 : B0 / 87 ~ 89 : B+
		 * 70 ~ 73 : C0 / 74 ~ 76 : C0 / 77 ~ 79 : C+
		 * 나머지 : F
		 * 
		 * << 입력 형태 >>
		 * 점수를 입력하세요...
		 * 
		 * << 줄력 형태 >>
		 * 학점은 ㅁ입니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요... ");
		
		int num = scan.nextInt();
		// char grade, type = '0';
		char grade = ' ';
		char type = '0';
		
	//  [풀이]
		if ( num % 10 >= 7 || num == 100 ) {
			type = '+';
		}  else if ( num % 10 <= 3 ) {
			type = '-';
		}
		
		if ( num >= 90 ) {
			grade = 'A';
		} else if ( num >= 80 ) {
			grade = 'B';
		} else if ( num >= 70 ) {
			grade = 'C';
		} else {
			grade = 'F';
			type = ' ';
		}
		
//		if ( num >= 70 ) {
//			if ( ( num % 10 ) >= 7 || num == 100 ) {
//				type = '+';
//			} else if ( ( num % 10 ) >= 4 ) {
//				type = '0';
//			} else {
//				type = '-';
//			}
//		}
		
		System.out.printf("학점은 %c%c 입니다.\n", grade, type);
		System.out.printf("500을 문자열로 출력합니다. %s입니다.", 500);
		
		scan.close();
	}
}
