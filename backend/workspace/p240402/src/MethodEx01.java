
public class MethodEx01 {
	// main 메소드
	public static void main(String[] args) {
		System.out.println("== 1. main Mathod 시작 ==");
		increment(5);
		System.out.println("== 2. main Method 종료 ==");
	}

	// method 정의 형태
	// 기능 : 인수로 받은 값을 1증가 후 출력
	public static void increment(int num) {
		System.out.println("== 3. increment Method 시작 ==");
		num++;
		System.out.println("1 증가된 값 : " + num);
		System.out.println("== 4. increment Method 종료 ==");
	}
}
