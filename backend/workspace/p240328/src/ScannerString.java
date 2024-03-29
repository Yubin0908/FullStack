import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) {
		
		// 1. 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 2-1 문자열 입력 : next() - 공백기준 앞까지만 출력
		System.out.print("문자열을 입력하세요 >>  ");
		String strOne = scan.next();
		
		// 2-2 문자열 입력 : nextLine() - 엔터기준 앞까지만 출력
		System.out.print("문자열을 입력하세요 >> ");
		String strTwo = scan.nextLine();
		
		System.out.println("strOne >> " + strOne);
		System.out.println("strTwo >> " + strTwo);
		
		scan.close();
	}
}
