
public class ArrayEx03 {

  public static void main(String[] args) {

    // 1차원 배열
    int[] arr = new int[5];

    // 2차원 배열
    int[][] arr2 = new int[2][3];

    System.out.println("arr : " + arr);
    System.out.println("arr2 : " + arr2);
    System.out.println("arr2[0] : " + arr2[0]);
    System.out.println("arr2[1] : " + arr2[1]);

    System.out.println("[행의 길이}arr2 length : " + arr2.length);
    System.out.println("인덱스 0행의 열의 길이 : " + arr2[0].length);

    arr2[0][0] = 2;
    arr2[0][1] = 4;
    arr2[0][2] = 6;
    arr2[1][0] = 8;
    arr2[1][1] = 10;
    arr2[1][2] = 12;

    System.out.println("일반 for문============================");
    for(int i = 0; i < 2; i++) {
      for(int j = 0; j < 3; j++) {
        System.out.print(arr2[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("length 이용==========================");

    for(int i = 0; i < arr2.length; i++) {
      for(int j = 0; j < arr2[i].length; j++) {
        System.out.print(arr2[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("확장 for문============================");

    for (int[] a : arr2) {
      for (int as : a) {
        System.out.print(as + " ");
      }
      System.out.println();
    }
  }
}