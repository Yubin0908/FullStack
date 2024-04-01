import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
			
		// 컴퓨터와 가위 바위 보 하기
		// 가위(1), 바위(2), 보(3)
		
		// [입력 형태]
		// 가위(1), 바위(2), 보(3) 중 하나를 입력하시오.
		// [출력 형태]
		// 당신이 이겼습니다.
		
		// 1. 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 2. 사용자 입력
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하시오.");
		int user = scan.nextInt();
		
		// 3. 랜덤값
		int computer = (int)(Math.random() * 3) + 1;
		System.out.println("컴퓨터 >> " + computer);
		// 4. 결과
		switch ( user - computer ) {
			case 1: case -2 :
				System.out.println("당신이 이겼습니다!");
				break;
			case 2: case -1 :
				System.out.println("당신이 졌습니다!");
				break;
			case 0 :
				System.out.println("비겼습니다.");
				break;
		} 
		
		// 메모리 해제
		scan.close();
	}
}
