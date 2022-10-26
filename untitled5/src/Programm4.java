import java.util.Scanner;
public class Programm4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite neskilko slov ili fraz: ");
        String a = scan.nextLine();
        String b = scan.nextLine();
        System.out.print("Vi vveli slovo/frazu: " + a);
        System.out.print(b);
    }
}
