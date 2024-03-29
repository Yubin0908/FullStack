import java.util.Scanner;

public class ScannerInt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1개 입력 >> ");
		int one = scan.nextInt();
		
		System.out.print("정수 1개 입력 >> ");
		int two = scan.nextInt();
		
		System.out.printf("정수 1 : %d \t정수 2 : %d", one, two);
		
		scan.close();
	}
}
