import java.util.Scanner;
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
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 2개 입력 >> ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		// method 호출
		add(num1, num2);
	}
}
