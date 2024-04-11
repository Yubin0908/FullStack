
class Person {
	int age;
	String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}

public class InstanceEx06 {

	// [ 메서드 정의 ] ===============
	// 메서드명 : show, 매개변수 : 참조형, 리턴 : 없음
	public static void show(Person person) {
		System.out.println("나이 : " + person.getAge());
		System.out.println("이름 : " + person.getName());
	}

	public static void main(String[] args) {
		
		Person hong = new Person();
		hong.setAge(25);
		hong.setName("홍길동");
		show(hong);

		Person park = new Person();
		park.setAge(35);
		park.setName("박보검");
		show(park);

		show(new Person());
	}
}
