// 문제

public class MethodQuiz02 {

	// method 정의
	// - 기능 : 정수 1개를 받아서, 제곱값 출력
	// - 메서드명 : square, 매개변수 : 1개, 리턴값 : 없음
	// - 출력형태 : 5의 제곱은 25입니다.
	// - 출력형태 : 4의 제곱은 16입니다.
	public static void square(int num) {
		// System.out.printf("%d의 제곱은 %d입니다.\n", num, (num * num));
		System.out.printf("%d의 제곱은 %d입니다.\n", num, (int)Math.pow(num, 2));
	}
	
	public static void main(String[] args) {
		// 메소드 호출
		square(5);
		square(4);
		
	}
}
