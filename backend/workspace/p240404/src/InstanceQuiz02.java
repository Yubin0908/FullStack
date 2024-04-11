
class Customer {
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println("ID : " + id + ", " + "NAME : " + name);
	}
}

public class InstanceQuiz02 {
	
	public static void main(String[] args) {
		
		Customer hong = new Customer();
		hong.setId(1);
		hong.setName("홍길동");
		hong.showInfo(); // 출력형태 - ID : 1, NAME : 홍길동
		
		Customer park = new Customer();
		park.setId(2);
		park.setName("박보검");
		park.showInfo(); // 출력형태 - ID : 2, NAME : 박보검
		
	}	
}
