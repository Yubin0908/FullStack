
class Robot {
  int productYear;
  String productName;

  public int getProductYear() {
    return productYear;
  }

  public void setProductYear(int productYear) {
    this.productYear = productYear;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }
}

public class InstanceEx01 {
  // 참조형 리턴형
  // 리턴형(반환형)이 참조형이다.
  public static Robot constructRobot() {
    Robot robot = new Robot();
    robot.setProductName("옵티머스");
    robot.setProductYear(2000);
    return robot;
  }

  public static void main(String[] args) {
    // constructRobot() 호출
    Robot robot = constructRobot();
    System.out.println("로봇의 제품명 : " + robot.getProductName());
    System.out.println("로봇의 생산년도 : " + robot.getProductYear());

    Robot robot2 = constructRobot();

    if (robot == robot2)
      System.out.println("같아. robot 주소 [" + robot + "], robot2 주소 [" + robot2 + "]");
    else
      System.out.println("달라. robot 주소 [" + robot + "], robot2 주소 [" + robot2 + "]");
  }
}