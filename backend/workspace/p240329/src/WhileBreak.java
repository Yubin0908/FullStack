
public class WhileBreak {
	
	public static void main(String[] args) {
		
		int idx = 0;
		
		while ( idx < 10 ) {
			idx++;
			
			if ( idx % 2 == 1 ) {
				break;
			}
			
			System.out.println("idx >> " + idx);
		}
		
		System.out.println("반복문 실행 후 idx : " + idx);
		System.out.println("== 프로그램 종료 ==");
	}

}
