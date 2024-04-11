
/*
  [ 변수 종류 ]          |   Memory area   |    할당 시기    |    initialize 하지 않은 경우
  - 지역변수(local var)  |   stack         | 해당 영역 실행   |     쓰레기 값
  - instance field      |   heap          | 생성 될 때      |     기본값
  - static field        |   static(class) | class 로딩 시점 |     기본값

  [static]
  -- static field --
   : class가 메모리에 로드될 때, static영역에 할당
   : 클래스명으로 관리 --> 클래스명으로 접근
   : instance 생성과 상관없이 접근 가능.
   --> 객체 생성과 상관없이 field 사용하고자 할때
   문법 : 클래스명.필드명
   : 해당 클래스로 생성된 객체들이 공유하는 변수

   -- static method --
   : class가 메모리에 로드될 때, static영역에 할당
   : 클래스명으로 관리 --> 클래스명으로 접근
   : instance 생성과 상관없이 접근 가능.
   --> 객체 생성과 상관ㅇ없이 메소드 호출 하고자 할 때
   : static 메소드 내에서는 static 멤버만 접근가능.
   --> 생성(메모리 할당) 시기가 달라서 instance field접근 불가
   --> static 멤버가 메모리 할당 후, 객체 생성 시 instance멤버가 메모리 할당.
   문법 : 클래스명.메소드명()
   : 해당 클래스로 생성된 객체들이 공유하는 메소드

 */
class Number {
  // field : instance field, static field
  static int one;
  int two;

}

public class StaticEx01 {

  public static void main(String[] args) {

    System.out.println("static field [one] : " + Number.one);
    Number.one = 1;

    Number number = new Number();
    System.out.println("instance field [two] : " + number.two);

    // static field는 static 방식으로 접근 : 클래스명.필드명
    System.out.println("one : " + number.one);


  }
}

