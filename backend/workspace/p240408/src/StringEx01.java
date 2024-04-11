public class StringEx01 {

  public static void main(String[] args) {
    // [문자열] 문자 여러 개가 연속된 형태.
    String s1 = "안녕";
    String s2 = "안녕";
    String s3 = new String("안녕");
    String s4 = new String("안녕");

    System.out.println(s1);
    System.out.println(s3);
    System.out.println(s4);

    if(s1 == s2)
      System.out.println("같다");
    else
      System.out.println("다르다");

    if(s3 == s4)
      System.out.println("같다");
    else
      System.out.println("다르다");

    // equals() : 문자열의 비교
    if(s3.equals(s4))
      System.out.println("같은 문자열");
    else
      System.out.println("다른 문자열");

  }
}
