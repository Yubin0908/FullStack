// 문제
public class MethodQuiz01 {
	// method 정의
	// - 기능 : 양의 정수 2개를 받아, 누적합 출력
	// method 명 : add, 매개변수 : 2개, 리턴값 : 없음
	// 2 ~ 5 의 누적합 >> 14
	public static void add(int num1, int num2) {
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		int sum = 0;
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.printf("%d ~ %d의 누적합 >> %d\n", num1, num2, sum);
	}
	
	// [풀이]
//	public static void add_A(int n1, int n2) {
//		int sum = 0;
//		int max = 0, min = 0;
//		
//		if (n1 > n2) {
//			max = n1;
//			min = n2;
//		} else {
//			max = n2;
//			min = n1;
//		}
//		
//		for(int i = min; i <= max; i++) {
//			sum += i;
//		}
//		
//		System.out.printf("%d ~ %d의 누적합 >> %d\n", n1, n2, sum);
//	}
	
	public static void main(String[] args) {
		add(2, 5);
		add(5, 2);
		// add_A(5,2);
	}
}
