
class Cat {
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

public class InstanceEx05 {
	
	public static void main(String[] args) {
		
		Cat happy = new Cat();
		Cat sky = new Cat();
		
		// Instance에 이름 저장
		happy.setName("해피");
		sky.setName("스카이");
		
		// Instance에 저장된 이름 출력
		System.out.println("happy에 저장된 이름 >> " + happy.getName());
		System.out.println("sky에 저장된 이름 >> " + sky.getName());
	}
}
