
public class ArrayEx02CleanCode {

  public static void main(String[] args) {

    // 1. 참조 변수 선언 및 초기화
    int[] math = {80, 95, 90, 70, 100};

    for(int i = 0; i < math.length; i++) {
      System.out.println(i + "번째 값 : " + math[i]);
    }

    for(int m : math) {
      System.out.println(m);
    }
  }
}
