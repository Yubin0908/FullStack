
public class MethodEx05 {

	public static void main(String[] args) {
		div(5, 2);
		div(7, 0);
	}
	
	public static void div(int n1, int n2) {
		// 분모가 0이면, '분모가 0으로 계산 불능입니다.' 출력하시오.
		try {
			int result = n1 / n2;
			System.out.println("몫 : " + result);
		} catch (ArithmeticException e) {
			System.out.println("분모가 0으로 계산 불능입니다.");
		}
	
	}
}
