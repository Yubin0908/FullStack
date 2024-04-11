
public class ParameterEx02 {

  // 매개변수가의 타입이 배열이라면 ?
  public static void sum( int[] args) {
    System.out.println("args : " + args);

    for(int ar : args) {
      System.out.println(ar + " ");
    }
    System.out.println();

  }

  public static void main(String[] args) {
    // sum(); // 인수 없어서 에러
    // sum(1, 2); // type 불일치
    sum(new int[]{3, 5});
    // sum({3, 5}); // new int[] 생략 불가
    sum(new int[0]); // 길이가 0인 배열
    // sum(null); // 참조값 없음
  }
}
