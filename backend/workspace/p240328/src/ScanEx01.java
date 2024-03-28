import java.util.Scanner;

public class ScanEx01 {

	public static void main(String[] args) {

//		int num = 5;
//		System.out.println("num에 저장된 값 >> " + num);
		
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		System.out.println("num에 저장된 값 : " + num);
		
		scan.close();
		
		
	}
}
