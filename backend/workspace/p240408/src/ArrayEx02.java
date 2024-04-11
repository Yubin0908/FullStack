
class Student {
  // field
  int age;
  String name;

  // constructor
  Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  // method
  void showInfo() {
    System.out.println("나이 : " + this.age);
    System.out.println("이름 : " + this.name);
  }
}

public class ArrayEx02 {

  public static void main(String[] args) {

    // 객체 배열 : 1차원 배열
    // 타입[] 배열명 = new 타입[];
    Student[] smart = new Student[3];

    smart[0] = new Student(20, "hong");
    smart[1] = new Student(35, "park");
    smart[2] = new Student(52, "lee");
    // 1) 배열의 요소는 참조변수로 구성됨.

    System.out.println(" ** 일반 for문 출력 **");
    for(int i = 0; i < smart.length; i++) {
      System.out.println(smart[i]);
      smart[i].showInfo();
    }

    System.out.println(" ** 향상 for문 출력 **");
    for(Student student : smart) {
      System.out.println(student);
      student.showInfo();
    }

    // 모든 학생의 나이를 1증가
    for(Student student : smart) {
      student.age++;
    }

    System.out.println(" ** 나이 증가 후 출력 **");
    // 출력
    for(Student student : smart) {
      student.showInfo();
    }

  }
}
