
class Baseball {
  static int count;

  void increment() {
    count++;
  }

  void decrement() {
    count--;
  }

  void baseballInfo() {
    System.out.println("현재 개수 : " + count);
  }
}

public class StaticEx02 {
  public static void main(String[] args) {

    System.out.println("개수 :  " + Baseball.count);

    Baseball b1 = new Baseball();
    b1.increment();
    b1.baseballInfo();

    Baseball b2 = new Baseball();
    b2.increment();
    b2.baseballInfo();

    System.out.println("개수 :  " + Baseball.count);

  }
}
