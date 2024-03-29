
public class WhileEx03 {

	public static void main(String[] args) {
		
		int idx = 1;
		
		while ( idx <= 10 ) {
			int num = 100;
			System.out.println("while문 내 선언된 변수 num : " + num);
			idx++;
			
		}
		
		System.out.println("idx : " + idx);
		// System.out.println("while문 밖에서 num 접근 : " + num);
	}
}
