
class Student {
  int age;
  String name;

  Student(int age) {
    this.age = age;
  }

  Student() { }

  void setAge(int age) {
    this.age = age;
  }

  void showInfo() {
    System.out.println("나이 : " + age);
  }
}

public class ConstructorEx01 {

  public static void main(String[] args) {
    // 홍길동 객체(인스턴스) 생성
    System.out.println("** 홍길동 학생 정보 **");
    Student hong = new Student(25);
    hong.showInfo();
    hong.setAge(26);
    hong.showInfo();

    System.out.println("** 박보검 학생 정보 **");
    Student park = new Student();
    park.showInfo();
    park.setAge(35);
    park.showInfo();
    // constructor 와 setter의 차이
    // constructor : 객체를 새로 생성할 때 사용.
    // setter : 필드(멤버변수)의 값을 세팅 할때 사용.
  }
}
