package Interface;


import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Auto tesla = new Auto(new SilnikElektryczny());
        Silnik diesel = new SilnikDiezela();
        Silnik elektryk = new SilnikElektryczny();
        List<Silnik> silniki = new ArrayList<>();
        silniki.add(elektryk);
        silniki.add(diesel);
        tesla.jedz();
        for (Silnik silnik : silniki)      {
            System.out.println(silnik.dajGlos());
        }
    }
}
