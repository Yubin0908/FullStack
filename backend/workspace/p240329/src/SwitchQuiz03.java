import java.util.Scanner;

public class SwitchQuiz03 {

	public static void main(String[] args) {
		/*
		 * 정수 2개와 사칙연산 기호를 입력받은 후, 식과 계산된 값을 출력하시오.
		 * 단, 정수 먼저 입력받기.
		 * 
		 * [입력 형태]
		 * 정수 2개를 입력하세요...
		 * 사칙연산(+, -, *, /) 중 하나를 입력하세요...
		 * 
		 * [줄력 형태]
		 * 5 + 2 = 7
		 * 
		 * 사용자가 사칙연산 이외의 기호를 입력하였을 경우, '잘못된 연산자를 입력했군요!' 를 출력하시오.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력하세요... ");
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		
		// scan.nextLine();
		
		System.out.print("사칙연산(+, -, *, /) 중 하나를 입력하세요... ");
		// String operation = scan.nextLine();
		String operation = scan.next();
		
		switch ( operation ) {
			case "+" :
				System.out.printf("%d %s %d = %d", firstNum, operation, secondNum, (firstNum +  secondNum));
				break;
			case "-" :
				System.out.printf("%d %s %d = %d", firstNum, operation, secondNum, (firstNum -  secondNum));
				break;
			case "*" :
				System.out.printf("%d %s %d = %d", firstNum, operation, secondNum, (firstNum * secondNum));
				break;
			case "/" :
				System.out.printf("%d %s %d = %f", firstNum, operation, secondNum, ((float)firstNum / secondNum));
				break;
			default :
				System.out.print("잘못된 연산자를 입력했군요!");
		}
		
		scan.close();
	}
}
