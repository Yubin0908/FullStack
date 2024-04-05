// 문제

public class MethodQuiz03 {
	// 메서드 정의
	// - 기능 : 정수하나를 입력받은 후, 팩토리얼 출력
	// - 메소드명 : factorial, 매개변수 : 1개, 리턴값 : 없음
	// - 출력형태 : 5! = 120
	// [ 방법 1] ====================================
//	public static void factorial(int num) {
//		int sum = 1;
//		
//		for(int i = 1; i <= num; i++) {
//			sum *= i;
//		}
//		
//		System.out.printf("%d! = %d\n", num, sum);
//	}
	// ==========================================
	// [ 방법 2 ] ===================================
	// 재귀호출 / 재귀함수
	public static int factorial(int num) {
		if(num == 1) 
			return 1;
		else
			return num * factorial(num - 1);
		
	}
	// ==========================================
	public static void main(String[] args) {
		// 메소드 호출
		System.out.println("5! = " + factorial(5));
	}
}
