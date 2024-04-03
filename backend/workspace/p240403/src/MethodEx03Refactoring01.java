import java.util.Scanner;

public class MethodEx03Refactoring01 {

	public static void main(String[] args) {
		
		int num = 5;
		increment(num);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1개를 입력하세요.. ");
		int user_num = scan.nextInt();
		increment(user_num);
		
		int var = 10;
		increment(var);
		
		scan.close();
	}
	
	public static void increment(int ar) {
		ar++;
		System.out.println("1증가 값 >> " + ar);
	}
}
