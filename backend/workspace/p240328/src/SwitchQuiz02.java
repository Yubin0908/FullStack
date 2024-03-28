
public class SwitchQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * [ 문 제 ]
		 * if -> switch 문으로 변경
		 */
		
		int  num = 25;
		
//		if ( num >= 0 && num < 10 ) {
//			System.out.println("0이상 10미만의 수");
//		} else if ( num >= 10 && num < 20) {
//			System.out.println("10이상 20 미만의 수");
//		} else if ( num >=20 && num < 30) {
//			System.out.println("20이상 30 미만의 수");
//		} else {
//			System.out.println("30이상의 수");
//		}
		
		switch ( num % 100 ) {
			case 1, 2, 3, 4, 5, 6, 7, 8, 9 :
				System.out.println("0이상 10미만의 수");
				break;
			case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 :
				System.out.println("10이상 20미만의 수");
				break;
			case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 :
				System.out.println("20이상 30미만의 수");
				break;
			default :
				System.out.println("30이상의 수");
				break;
		}
 	}
}
