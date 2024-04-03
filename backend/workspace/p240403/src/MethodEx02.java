
public class MethodEx02 {

	public static void main(String[] args) {
		sum(2, 3);
		sum(2.1, 3.3);
//		System.out.println(5);
//		System.out.println(5.1);
//		System.out.println('A');
//		System.out.println("AAA");
//		System.out.println(true);
	}
	
	public static void sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("덧셈 결과 : " + result);
	}
	
	public static void sum(double n1, double n2) {
		double result = n1 + n2;
		System.out.println("덧셈 결과 : " + result);
	}
	
}
