
class Person {
	// 멤버 변수
	int age;
	
	// 멤버 클래스
	void showInfo() {
		System.out.println("** 정보 **");
	}
}

public class InstanceEx02 {

	public static void main(String[] args) {
		// 객체 생성
		Person p1 = new Person();
		// 멤버변수에 접근
		System.out.println(p1.age);
		// 참조변수 p1의 저장된 주소
		System.out.println(p1);
		
		Person p2 = p1; // 주소복사(같은 객체 접근)
		
		System.out.println("p2에 저장된 주소 : " + p2);
	}
}
