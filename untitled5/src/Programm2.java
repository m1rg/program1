import java.util.Scanner;
public class Programm2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite 2 liybih chisla: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a + b;
        System.out.println("Summa chisel: " + c);
    }
}
