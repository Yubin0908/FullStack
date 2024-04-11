
class Robot {
	// instance Field
	int year;
	String name;
	String company;
	
	// constructor
	Robot() {
		this(2000, "없음", "없음");
		System.out.println(" ** 매개변수가 없는 생성자 실행 **");
	}

	Robot(int year) {
		this(year, "없음", "없음");
		System.out.println(" ** 매개변수1개인 생성자 실행. Type : int **");
//		this.year = year;
//		this.name = "없음";
//		this.company = "없음";
	}

	Robot(String name) {
		this(2000, name, "없음");
		System.out.println(" ** 매개변수1개인 생성자 실행. Type : String **");
//		this.year = 2000;
//		this.name = name;
//		this.company = "없음";
	}

	Robot(String name, String company) {
		this(2000, name, company); // 생성자 내부에서 다른 생성자를 호출하려면 꼭 첫번째 줄에 와야하고, 1개만 호출이 가능하다.
		System.out.println(" ** 매개변수2개인 생성자 실행. Type : String **");
//		this.year = 2000;
//		this.name = name;
//		this.company = company;
	}

	Robot(int year, String name, String company) {
		System.out.println(" ** 매개변수3개인 생성자 실행. **");
		this.year = year;
		this.name = name;
		this.company = company;
	}

	// instance method
	void showInfo() {
		System.out.printf("생산년도 : %d, 제품명 : %s, 제조회사 : %s\n\n", year, name, company);
	}

}

public class InstanceEx08 {

	public static void main(String[] args) {
		
		Robot r1 = new Robot();
		r1.showInfo();
		
		Robot r2 = new Robot(2017);
		r2.showInfo(); // 생산년도 : 2017, 제품명 : 없음, 제조회사 : 없음
		
		Robot r3 = new Robot("페퍼");
		r3.showInfo(); // 생산년도 : 2000, 제품명 : 페퍼, 제조회사 : 없음

		Robot r4 = new Robot("페퍼", "메가봇");
		r4.showInfo(); // 생산년도 : 2000, 제품명 : 없음, 제조회사 : 메가봇

		Robot r5 = new Robot(2025, "아틀라스", "다이내믹스");
		r5.showInfo(); // 생산년도 : 2025, 제품명 : 아틀라스, 제조회사 : 다이내믹스
	}
}
