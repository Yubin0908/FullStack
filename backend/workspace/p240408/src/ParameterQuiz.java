
public class ParameterQuiz {
  public static String concat(String... args) {
    String str = "";

    for(String arg : args) {
      str += arg;
    }
    return str;
  }

  public static void main(String[] args) {
    String[] one = {"하나", "둘", "셋"};

    System.out.println(concat(one)); // 하나둘셋

    System.out.println(concat(new String[] {"넷", "다섯", "여섯"})); // 넷다섯여섯
    System.out.println(concat("넷", "다섯", "여섯"));
  }
}
