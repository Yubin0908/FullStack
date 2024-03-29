
public class WhileEx01 {

	public static void main(String[] args) {
		
		int num = 1;
		
		while(num < 3) {
			System.out.println("num >> " + num);
			num++;
		}
		System.out.println("반복문 실행 후 num : " + num);
		System.out.println("<< 실행 종료 >>");
	}
}
