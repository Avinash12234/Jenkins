public class Main {

  public static void main(String[] args) {
    int rows = 8;

    for (int i = 1; i <= rows; ++i) {
      for (int k = 1; k <= i; ++k) {
        System.out.print("$ ");
      }
      System.out.println();
    }
  }
}
