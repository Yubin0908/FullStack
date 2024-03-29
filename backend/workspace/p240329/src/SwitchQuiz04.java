import java.util.Scanner;

public class SwitchQuiz04 {

	public static void main(String[] args) {
		
		// 컴퓨터와 가위 바위 보 하기
		// 가위(1), 바위(2), 보(3)
		
		// [입력 형태]
		// 가위(1), 바위(2), 보(3) 중 하나를 입력하시오.
		// [출력 형태]
		// 당신이 이겼습니다.
		
		Scanner scan = new Scanner(System.in);

		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하시오.");
		int user = scan.nextInt();
		int cpu = (int)(Math.random() * 3 + 1);
		
		System.out.println("user : " + user + ", " + "cpu : " + cpu);
		
		switch ( user ) {
			case 1 :
				System.out.print(cpu == 1 ? "비겼습니다." : cpu == 2 ? "당신이 졌습니다." : "당신이 이겼습니다.");
				break;
			case 2 :
				System.out.print(cpu == 2 ? "비겼습니다." : cpu == 3 ? "당신이 졌습니다." : "당신이 이겼습니다.");
				break;
			case 3 :
				System.out.print(cpu == 3 ? "비겼습니다." : cpu == 1 ? "당신이 졌습니다." : "당신이 이겼습니다.");
				break;
			default :
				System.out.print("잘못된 입력입니다.");
		}
		
		scan.close();
	}
}
