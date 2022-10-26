import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the words through the gap: ");
        String b = sc.nextLine();

        int a = 0;

        if(b.length() != 0){
            a++;

            for (int i = 0; i < b.length(); i++) {
                if(b.charAt(i) == ' '){

                    a++;
                }
            }
        }

        System.out.println("You have entered "+ a +" words :)");
    }
    }
