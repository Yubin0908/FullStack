
public class WhileEx02 {
	public static void main(String[] args) {
		
		int idx = 1;
		
		while(true) {
			System.out.println("idx >> " + idx);
			
			if ( idx == 3) {
				break;
			}
			
			idx++;
		}
		
		System.out.println("== 프로그램 종료 ==");
	}
}
