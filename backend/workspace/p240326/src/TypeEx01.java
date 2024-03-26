
public class TypeEx01 {
	
	public static void main(String[] args) {
		// 변수 : 메모리 공간에 부여한 이름
		// 변수 선언 : [type] name;
		// 변수 선언 규칙 : 변수명 길이제한 x, 문자 또는 _ 또는 $로 시작, 대소문자 구분, 소문자로 시작, 연산자 및 예약어 사용 불가
		//              Camel Case : ex) numberOne, Snake Case : ex) number_one
		byte num;
		// System.out.printf("%d", num);
		// 변수 초기화
		num = 5;
		
		System.out.printf("초기화된 num 변수 : %d\n", num);
		
		num = 11;
		
		System.out.printf("바뀐 num 변수 : %d\n", num);
		
		// 변수 선언과 동시에 초기화
		int var = 7;
		System.out.println(var);
	}
}
