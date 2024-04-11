
class Parant {
  int money;

  public Parant() {
    this.money = 1_000_000;
    System.out.println("** [Parant] 매개변수 없는 생성자 함수 실행 **");
  }

  public Parant(int money) {
    this.money = money;
    System.out.println("** [Parant] 매개변수 1개인 생성자 함수 실행 **");
  }

  void buy(int money) {
    this.money -= money;
    System.out.println("남은 돈은 : " + this.money + "원입니다.");
  }
}

class Child extends Parant {

  public Child() {
    System.out.println("** [Child] 매개변수가 없는 생성자 실행 **");
  }

  public Child(int money) {
    super(money);
    System.out.println("** [Child] 매개변수가 1개인 생성자 실행 **");
  }

  void showMoney() {
    System.out.println("부모님 돈 : " + super.money);
  }

}

public class InheritanceEx01 {

  public static void main(String[] args) {

    Child c1 = new Child();
    c1.showMoney();

    Child c2 = new Child(500_000);
    c2.showMoney();
  }
}
