
class Item {
  int year;
  String name;
  final String company;

  // Item() {}

  public Item(int year, String name, String company) {
    this.year = year;
    this.name = name;
    this.company = company;
  }

  void setName(String name) {
    this.name = name;
  }
   // cannot assign a value to final variable company
   // 이유 : 멤버 변수 company는 final 변수로 선언되어 있기 때문에 객체 생성 이후 값 변경이 불가능하다.
//  void setCompany(String company) {
//    this.company = company;
//  }

  void showInfo() {
    System.out.printf("생산년도 : %d, 제품명 : %s, 제조회사 : %s", year, name, company);
  }
}

public class FinalEx02 {

  public static void main(String[] args) {

    Item item = new Item(2021, "곰돌이", "다이소");
    item.showInfo();

    // final변수로 값변경 금지
    // item.company = "이마트";
    item.name = "곰순이";

    // final field에 값 설정이 안되는 이유? final 키워드가 사용된 변수는 초기화 된 이후에는 값을 변경 할 수 없다.
    // Item itemTwo = new Item();
//    itemTwo.setCompany("롯데마트");
  }
}
