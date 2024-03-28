import java.util.Scanner;

public class ScanEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 2. 문자열 임력
		System.out.print("문자열을 입력 하세요 >>");
		String str = scan.nextLine();
		
		System.out.printf("사용자가 입력한 문자열 : %s", str);
	}
}
