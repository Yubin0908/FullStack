
class Car {
	// instance field
	int door;
	String color;
	// default constructor
	Car() {
		System.out.println("[매개변수가 없는 생성자 실행]");
	}
	
	Car(String color) {
		this.color = color;
		System.out.println("[매개변수가 1개인 생성자 실행]");
	}
	
	// constructor
	Car(int door) {
		this.door = door;
		System.out.println("[매개변수가 1개인 생성자 실행]");
	}
	
	Car(int door, String color) {
		this.door = door;
		this.color = color;
		System.out.println("[매개변수개 2개인 생성자 실행]");
	}
	
	// instance method
	public void setDoor(int door) {
		this.door = door;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	void showInfo() {
		System.out.printf("door : %d, color : %s\n\n", door, color);
	}
}
// 생성자 (Constructor)
// : 객체 생성 시, 무조건 하나의 생성자가 호출 됨.
// : 생성자는 '메서드'이다. -> 메소드 오버로딩이 가능하다. -> 생성자는 여러개 정의가 가능
// : 생성자는 반환값이 없다. -> 반환형을 명시하지 않음.
// : 생성자명을 클래스명과 동일하여야 한다.
// : default constructor : 기본생성자
// : 생성자를 명시하지 않으면, 기본 생성자가 실행된다.
// : 매개변수가 없고, 하는 일도 없다. -> 형식상 실행.

public class InstanceEx07 {

	public static void main(String[] args) {

		Car c1 = new Car(4);
		c1.showInfo();
		
		Car c2 = new Car();
		
		Car c3 = new Car("White");
		c3.showInfo();
		
		Car c4 = new Car(2, "skyBlue");
		c4.showInfo();
	}
}
