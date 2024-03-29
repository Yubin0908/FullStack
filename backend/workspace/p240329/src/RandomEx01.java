
public class RandomEx01 {

	public static void main(String[] args) {
		
		// ramdom값
		// 문법 : Math.random();
		// 0 <= random값 < 1
		// 0 이상 1 미만의 랜덤값
		
		// 랜덤값 1 ~ 3
		System.out.println((int)(Math.random() * 3 + 1));
		
		// 랜덤값 : 1 ~ 45
		int random = (int)(Math.random() * 44 + 1);
		System.out.println("1 ~ 45 사이의 랜덤 값 : " + random);
	}
}
