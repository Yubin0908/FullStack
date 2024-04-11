
// class - 자료형

public class StaticEx07 {

  // static field
  final static StaticEx07 staticEx07 = new StaticEx07();

  int num = 100; // instance field

  // instance method
  void show() {
    System.out.println("num >> " + num);
  }

  public static void main(String[] args) {
    staticEx07.show();
  }
}
