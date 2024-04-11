
class Person {
  static int count; // static field
  int age; // instance field

  void show() { // instance method
    System.out.println("** instance method show()");
    System.out.println("현재 인원 : " + count);
    System.out.println("나이 : " + age);
    staticMethod(); // static method 호출 가능
    instanceMethod(); // instance method 호출 가능
  }

  void instanceMethod() {
    System.out.println(" ** instance method **");
  }

  static void staticMethod() {
    System.out.println(" ** static method **");
  }

  static void staticShow() { // static method
    System.out.println("** static method staticShow()");
    System.out.println("현재 인원 : " + count);
    staticMethod();
    // instanceMethod(); // instance method 호출 안됨.
    // System.out.println("나이 : " + age); // instance field는 접근이 불가하다.
  }
}

public class StaticEx04 {
  public static void main(String[] args) {

    Person person = new Person();
  }
}
