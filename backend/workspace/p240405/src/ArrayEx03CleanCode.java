
public class ArrayEx03CleanCode {

  public static void main(String[] args) {

    // 2차원 배열 생성과 초기화
    int[][] arr2 = {
        {2, 4, 6},
        {8, 10, 12},
    };

    System.out.println("행 길이 : " + arr2.length);
    System.out.println("첫 번째 행 열길이 : " + arr2[0].length);
    System.out.println("두 번쨰 행 열길이 : " + arr2[1].length);

    for (int[] a : arr2) {
      for (int as : a) {
        System.out.print(as + " ");
      }
      System.out.println();
    }
  }
}