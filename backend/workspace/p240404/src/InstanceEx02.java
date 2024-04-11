
class Fruit {
	int count;
	String sort;
	
	// getter : 멤버 변수의 값을 리턴하는 메서드
	public int getCount() {
		return count;
	}
	// setter : : 멤버 변수에 값 설정
	public void setCount(int count) {
		this.count = count;
		System.out.println("this에 저장된 주소 >> " + this);
	}
	
}

public class InstanceEx02 {

	public static void main(String[] args) {
		
		// 객체생성
		Fruit fruit = new Fruit();
		System.out.println("참조 변수 fruit에 저장된 주소 : " + fruit);
		
		// 멤버 메서드 호출
		System.out.println("멤버변수 count : " + fruit.getCount());
		
		fruit.setCount(10);
		System.out.println("멤버변수 count : " + fruit.getCount());
	}
}
