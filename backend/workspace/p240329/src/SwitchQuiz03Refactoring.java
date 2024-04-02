import java.util.Scanner;

public class SwitchQuiz03Refactoring {

	public static void main(String[] args) {
		
		// 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		
        // 2. 정수 2개 입력
        System.out.print("정수 2개를 입력하세요...");
        int valueOne = scan.nextInt();
        int valueTwo = scan.nextInt();
		
        // 3. 연산자 1개 입력
        System.out.print("사칙연산[+, -, *, /] 중 하나를 입력하세요...");
        String operator = scan.next(); // next()는 메모리 비우는 과정이 필요없음.
        
        // 계산결과를 저장할 변수
        int result = 0;
        
        // 4. 식과 값 출력
        switch ( operator ) {
        	case "+" :
        		result = valueOne + valueTwo;
                break;
            case "-" :
            	result = valueOne - valueTwo;
                break;
            case "*" :
            	result = valueOne * valueTwo;
                break;
            case "/" :
            	result = valueOne / valueTwo;
                break;
            default : 
            	System.out.println("잘못된 연산자를 입력하셨군요!!");
            	operator = " ";
        }
        // 반복되는 출력문구
        if ( operator != " " ) {
        	// System.out.println(valueOne + " " + operator + " " + valueTwo + " = " + result);
        	System.out.printf("%d %s %d = %d", valueOne, operator, valueTwo, result);
        }
        
		// 5. 메모리 해제(자원 해제)
		scan.close();
	}
}
