
public class IfEx02 {

	public static void main(String[] args) {
		
		 int num = 5;
		 
		 if (num >= 10) {
			 num++;
			 System.out.println("true일 때, 실행되는 영역");
	 	 } else {
	 		 System.out.println("false일 때, 실행되는 영역");
	 	 }
		 
		 System.out.println("num : " + num);
	}
}
