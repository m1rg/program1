public class Programm63 {
    public static void main(String[] args) {
      int a = 1;
      int b = 0;

      do {
         b += a++;
      }
      while (a < 10);
      System.out.println(b);
    }
}
