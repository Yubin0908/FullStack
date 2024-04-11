public class WrapperClass {

  public static void main(String[] args) {

    int num = 5;
    Integer num2 = 5;

    System.out.println(num);
    System.out.println(num2);

    Integer num3 = num;

    // Integer num5 = new Integer(7);
    Integer num6 = Integer.valueOf(7);
  }
}
