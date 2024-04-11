
public class ArrayEx02 {

  public static void main(String[] args) {
    // 학생들의 수학점수저장
//    int math01 = 80;
//    int math02 = 95;
//    int math03 = 90;
    // 1. 배열생성
    // 1-1)참조 변수 선언
    int[] math;

    // 1-2) 배열생성
    math = new int[5];

    // 2. 배열 초기화
    math[0] = 80;
    math[1] = 95;
    math[2] = 90;
    math[3] = 70;
    math[4] = 100;

    for(int i = 0; i < math.length; i++) {
      System.out.println(i + "번째 값 : " + math[i]);
    }

    for(int m : math) {
      System.out.println(m);
    }
  }
}
