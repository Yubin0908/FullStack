
public class SwitchEx01 {

	public static void main(String[] args) {
		// 변수
		int num = 2;
		float fo = 2.34F;
		int one = 1;
		
		// 상수
		final int TWO = 2;
		
		switch ( num ) {
			case 1 :
				System.out.println("1이다.");
				break;
			case TWO :
				System.out.println("2이다.");
				break;
			case 3 :
				System.out.println("3이다.");
				break;
			default :
				System.out.println("나머지");
				break;
		}
		
		System.out.println("** 실행 완료 **");
	}
}
