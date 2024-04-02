
public class MethodEx02 {

	public static void main(String[] args) {
		System.out.println("** main method 시작 **");
		
		// int sumResult = sum(2, 5);
		System.out.println("sumResult 호출 결과 >> " + sum(2, 5));
		
		System.out.println("** main method 종료 **");
	}
	
	// 기능 : 인수로 정수 2개를 받은 후, 덧셈 결과를 리턴
	// 메소드명 : sum, 매개변수 : 2개
	public static double sum(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}
	
}
