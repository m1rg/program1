public class Programm71 {
    public static void main(String[] args) {
        String[] a = { "Tishe "," edesh "," dalshe "," budesh "};

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;

        String c;

        for (int i = 0; i < n/2; i++) {
            c = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = c;
        }

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}
