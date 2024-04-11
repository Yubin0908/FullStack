public class ArrayEx01 {

  public static void main(String[] args) {

    // 2차원 배열 생성
    // 열 길이 생략 가능.
    // 행 길이 생략 불가능.
    int[][] arr2 = new int[2][];

    System.out.println("arr2 : " + arr2);
    System.out.println("arr2[0] : " + arr2[0]);
    System.out.println("arr2[1] : " + arr2[1]);

    // 열 : 1차원 배열 생성
    arr2[0] = new int[3];
    arr2[1] = new int[] {8};

    // 출력
    for(int[] ar : arr2) {
      for(int a : ar) {
        System.out.print(a + " ");
      }
      System.out.println();
    }
  }
}
