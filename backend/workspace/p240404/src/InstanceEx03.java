
class Dog {
	int age;
	
	void showInfo() {
		System.out.println("this >> " + this);
	}
}

public class InstanceEx03 {

	public static void main(String[] args) {
		// Dog class로 생성된 mozzi 객체
		Dog mozzi = new Dog();
		System.out.println("참조변수 mozzi에 저장된 주소 >> " + mozzi);
		mozzi.showInfo();
		// Dog class로 생성된 bella 인스턴스
		Dog bella = new Dog();
		System.out.println("참조변수 bella에 저장된 변수 >> " + bella);
		bella.showInfo();
	}
}
