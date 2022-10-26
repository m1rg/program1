public class Programm62 {
    public static void main(String[] args) {
        int x = 10;
        int y = 100;

        for ( ; x < y; x += 20, y --) ;

        System.out.println ("x raven " + x + " ; y raven " + y);

        //пока х не станет больше у, к х будет прибавляться 20, а от у отниматься единица (?)
        //в итоге 20 прибавилась 5 раз, от у единица отнялась 5 раз
        // поэтому ответ х = 110, у = 95

    }
}
