
class Student {
	// 멤버변수
	int age;
	String name;
	
	// 멤버 메소드 : 리턴형 메소드명(매개변수) { }
	void study() {
		System.out.println("열심히 공부 중!!!");
	}
}

public class InstanceEx01 {
/*
 * [ 클래스 (Class) ] ===================================
 * 클래스는 사용자 정의 자료형이다.
 * 참조형(Reference Type)
 * [ 특징 ]
 * 클래스명 : 대문자로 시작
 * 클래스 내 멤버 : 변수, 메소드
 * ===============================================
 */
	public static void main(String[] args) {
		// 변수 선언 : 기본형
		int num = 1;
		System.out.println("num >> " + num);
		
		// 변수 선언 : 참조형
		Student hong = null;
		// 객체 생성 : new 연산자 이용
		hong = new Student(); // Heap 메모리 영역에 할당하고 그 주소를 hong에 저장.
		
		// 멤버 접근 
		System.out.println("멤버 변수 age의 초기값 >> " + hong.age); // .은 접근 연산자로 사용
		System.out.println("멤버 변수 name의 초기값 >> " + hong.name);
		
		// 멤버 변수 값 설정
		hong.age = 17;
		System.out.println("멤버 변수 age >> " + hong.age);
		
		// 멤버 메소드 study() 호출
		hong.study();
		
		// 참조변수 선언과 초기화
		Student park = new Student();
		System.out.println("박보검의 나이 >> " + park.age);
		
		// 이렇게 생성할 경우, 주소를 알 수 없기 때문에 이후에 사용할 수 없다.(일회성)
		new Student().study();
	}
}
