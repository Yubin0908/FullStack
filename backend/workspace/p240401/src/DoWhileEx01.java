
public class DoWhileEx01 {

	public static void main(String[] args) {
		
		int idx = 10;
		
		// [ while 문 ]
//		while ( idx < 10 ) {
//			System.out.printf("idx >> \n" + idx);
//			idx++;
//		}
		// [ do~while 문 ]
		 do {
			System.out.printf("idx >> \n" + idx);
			idx++;
		} while ( idx < 10 );
		
		System.out.println("반복분 실행 후 idx >> " + idx);
		
	}
	
}
