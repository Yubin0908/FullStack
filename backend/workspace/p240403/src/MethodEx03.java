import java.util.Scanner;

public class MethodEx03 {

	public static void main(String[] args) {
		
		int num = 5;
		num++;
		System.out.println("1증가 값 >> " + num);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1개를 입력하세요.. ");
		int user_num = scan.nextInt();
		user_num++;
		System.out.println("user_num >> " + user_num);
		
		int var = 10;
		var++;
		System.out.println("var >> " + var);
		
		scan.close();
	}
}
