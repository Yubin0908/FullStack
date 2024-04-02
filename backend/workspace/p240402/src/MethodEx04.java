
public class MethodEx04 {
	public static void main(String[] args) {
		String str = returnString();
		
		System.out.println("returnString() 호출 결과 >> " + returnString());
		
		System.out.println(returnString());
	}
	
	// 기능 : 호출하면 문자열 리턴
	// 메소드명 : returnString, 매개변수 : void
	public static String returnString() {
		return "안녕~~";
	}
}
