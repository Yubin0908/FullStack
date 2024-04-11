
class Cat {
  static int count;
  String name;

  static void show() {
    System.out.println("고양이 몇 마리 : " + count);
  }

  void setName(String name) {
    this.name = name;
  }

  void showInfo() {
    System.out.println("고양이 이름 : " + this.name);
  }

}

public class StaticEx05 {

  public static void main(String[] args) {
    // static member 접근
    // className.memberName
    Cat.show();
    Cat.count = 3;

    // instance member 접근
    Cat cat = new Cat();
    cat.setName("미미");
    cat.showInfo();
  }
}
