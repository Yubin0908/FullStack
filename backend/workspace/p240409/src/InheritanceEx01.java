
class Parant {
  int money = 1000000;

  Parant() {
    System.out.println("** 부모(Parant) 실행 **");
  }

  void buy(int money) {
    this.money -= money;
    System.out.println("남은 돈은 : " + this.money + "원 입니다.");
  }
}

class Child extends Parant { // 부모(Parant)로부터 상속받음
  Child() {
    super();
    System.out.println("** 자식(Child) 실행 **");
  }

  // method Override : 메소드 재정의, 상속관계에서 자식클래스가 부모클래스의 멤버메서드를 재정의함.
  // 상속 조건 : 부모클래스의 멤버 메소드의 선언부를 그대로 사용하여야 함.(기능만 수정하여야 함)
  // 선언부 그대로 ? 리턴형, 메소드명, 매개변수 정보가 같아야됨.
  void buy(int money) {
    System.out.println("부모님 용돈 " + money + " 주세요.");
  }

  // method Overloading : 같은 이름의 메서드를 다수 정의
  // 조건 : 매개변수의 종류가 달라야함. 자료형, 갯수
  // 반환형과는 관련 없음.
  void buy() {
    System.out.println("용돈 주세요. 용돈~");
  }
}

public class InheritanceEx01 {

  public static void main(String[] args) {
    Child c1 = new Child();
    c1.buy(10000);
    c1.buy();
  }
}
