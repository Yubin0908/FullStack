
public class MethodEx01 {
	// [increment method]
	public static void increment(int one) {
		// int var = 100;
		one++;
		System.out.println("1 증가 >> " + one);
	}
	
	public static void main(String[] args) {
		int one = 1;
		increment(one);
		System.out.println("one >> " + one);
	}

}
