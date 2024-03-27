
public class CastEx02 {

	public static void main(String[] args) {
		/*
		 * byte - short - int - long [ 정 수 형 ]
		 * 큰(long) -> 작은(byte) : 강제형변환
		 * 작은(byte) -> 큰(long) : 자동형변환
		 * 
		 * float - double [ 실 수 형 ]
		 * 
		 */
		int num = 100;
		
		// 강제 형변환
		short sh = (short)num;
		byte by = (byte)num;
		
		long lo = num;
		
	}
}
