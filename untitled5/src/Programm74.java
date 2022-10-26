public class Programm74 {
    public static void main(String[] args) {

        int [] mas = new int[12];
        int a = -16;
        int b = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*31)-15;
            if(a <= mas[i]){
                a = mas[i];
                b = i;
            }
        }
        System.out.println("index is " + b);
    }
}
