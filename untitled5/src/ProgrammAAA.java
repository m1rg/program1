import java.util.Scanner;
public class ProgrammAAA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width of the triangle: ");
        Double a = scan.nextDouble();

        System.out.println("Enter the height of the triangle: ");
        Double b = scan.nextDouble();

        double c = (a*b)/2;
        System.out.println("Answer: " + c);

        System.out.println("Enter the width of the rectangle: ");
        Double z = scan.nextDouble();

        System.out.println("Enter the length of the rectangle: ");
        Double x = scan.nextDouble();

        double q = z*x;
        System.out.println("Answer: " + q);

        System.out.println("Enter the radius of the circle: ");
        Double m = scan.nextDouble();

        double n = Math.PI * (m*m);
        System.out.println("Answer: " + n);

        double h = 113.09733552923255;
      //  double g = Math.ceil("%.2f", h);
     //   System.out.println(g);

    }
}
