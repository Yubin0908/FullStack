

/*
 * [ 클래스 ] class
 *  : 자료형
 *  : 사용자 정의 자료형
 *  
 *  [ 객체 ] object, instance
 *  : 클래스로 생성된 구체화(실체화)된 대상
 *  : 자바는 모든 객체를 Heap영역에 생성한다. 멤버도 Heap영역에 할당
 *  : 객체가 Heap영역에 생성되면, 할달된 주소를 자동으로 리턴한다.
 *  : 생성된 객체는 간접적으로 접근이 가능하다.(반드시 주소를 통해서만 접근이 가능)
 *  
 *  [ 객체 생성 방법 ]
 *  : new 클래스명() { };
 *  : new - Heap영역에 할당.
 *  
 *  [ 참조변수 선언 ]
 *  : class명 변수명;
 */
class Student {
	// 멤버 변수
	int age;
	String name;
	// 멤버 메소드
	void study() {
		System.out.println("열심히 공부중!!!");
	}
}

public class InstanceEx01 {

	public static void main(String[] args) {
		// 참조변수 선언
		// Student class로 생성된 객체가 저장될 참조 변수 선언
		Student hong;
		
		// 객체 생성
		// heap영역에 Student class로 객체 생성
		hong = new Student();
		
		// 멤버 접근 : 외부접근을 권장하지 않음.
		System.out.println("hong 나이 : " + hong.age);
		hong.age = 17;
		System.out.println("hong 나이 : " + hong.age);
		
		// 멤버 메소드
		hong.study();
	}
}
