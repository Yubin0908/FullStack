
class Person {

  @Override
  public String toString() {
    return "[오버라이딩]Person";
  }
}

public class StringEx02 {

  public static void main(String[] args) {

    Person p = new Person();

    System.out.println(p);
    System.out.println(p.toString());
    System.out.println(p.getClass());
    System.out.println(p.getClass().getName());

    String str = "안녕";

    System.out.println(str);
    System.out.println(str.toString());

    String str2 = new String("안녕");
    System.out.println(str2);
  }
}
