
public class ArrayEx01 {

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

    System.out.println("1번째 값 : " + math[0]);
    System.out.println("2번째 값 : " + math[1]);
    System.out.println("3번째 값 : " + math[2]);
    System.out.println("4번째 값 : " + math[3]);
    System.out.println("5번째 값 : " + math[4]);

  }
}
