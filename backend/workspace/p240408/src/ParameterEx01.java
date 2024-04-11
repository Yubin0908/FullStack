

/* [가변인자] variable arguments
  -- JDK 1.5부터 지원
  -- 선언 형태 : type... parameter
  -- 내부적으로 배열 생성
  -- 마지막 위치에 선언하여야 한다.
 */
public class ParameterEx01 {

//  public static void sum(int n1, int n2) {
//    int sum = n1 + n2;
//    System.out.println("덧셈 결과 : " + sum);
//  }
  // error : arg 매개변수는 목록의 마지막 매개변수여야 합니다
  // public static void add(int n1, int... arg, int n2) {

  // }


  // 가변 인자
  public static void sum(int... args) {
    System.out.println("\n** 가변인자 **");
    // System.out.println("args : " + args);

    for(int arg : args) {
      System.out.print(arg);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    sum();
    sum(3, 5);
    sum(1);
    sum(1, 4, 7);
    sum(1, 5, 6, 4);
  }
}
