import java.util.Scanner;

public class IfQuiz04 {
	
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
		
		if ( num >= 90 ) {
			if ( num >= 97 ) {
				System.out.println("학점은 A+ 입니다.");
			} else if ( num <= 96 && num >= 94 ) {
				System.out.println("학점은 A0 입니다.");
			} else {
				System.out.println("학점은 A- 입니다.");
			}
		} else if ( num >= 80 ) {
			if ( num >= 87 ) {
				System.out.println("학점은 B+ 입니다.");
			} else if ( num <= 86 && num >= 84 ) {
				System.out.println("학점은 B0 입니다.");
			} else {
				System.out.println("학점은 B- 입니다.");
			}
		} else if ( num >= 70 ) {
			if ( num >= 77 ) {
				System.out.println("학점은 C+ 입니다.");
			} else if ( num <= 76 && num >= 74 ) {
				System.out.println("학점은 C0 입니다.");
			} else {
				System.out.println("학점은 C- 입니다.");
			}
		} else {
			System.out.println("학점은 F 입니다.");
		}
			
	}
}
