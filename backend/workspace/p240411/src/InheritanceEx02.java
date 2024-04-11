
class Super {
  int num;

  Super(int num) {
    this.num = num;
  }
}

class Sub extends Super {

  Sub(int num) {
    super(num);
  }
}

public class InheritanceEx02 {

  public static void main(String[] args) {
    Super s = new Super(5);
  }
}
