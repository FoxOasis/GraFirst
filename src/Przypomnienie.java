
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Przypomnienie {

    public static void main(String[] args) {
        StacjaPogody stacja = new StacjaPogody();
        Termometr termo = new Termometr();
        Scanner odczyt = new Scanner(System.in);

        String konsola = odczyt.next();
        System.out.println(konsola);

        int temperatura = stacja.podajTemperature(konsola);

        boolean jestLubNie = stacja.jest;
        if (jestLubNie) {
            System.out.println("W miescie " + konsola + "jest temperatura " + temperatura);
        } else {
            System.out.println("Nie znam tego mniasta a odpowiedzia na sens zycia jest " + temperatura);
        }
        System.out.println(termo.scalaBof());
    }
}
class Miasto {
    String miasto;
    int temperatura;
    double silaW;
    public Miasto(String miasto, int temperatura, double silaW) {
        this.miasto = miasto;
        this.temperatura = temperatura;
        this.silaW = silaW;
    }
}
class StacjaPogody {
 //   Miasto[] miasta = new Miasto[10];
    List<Miasto> miasta2 = new ArrayList();
    boolean jest;
    public StacjaPogody() {
        miasta2.add(new Miasto("Londyn", 10, 5.5));
        miasta2.add(new Miasto("Bangladesh", 30, 1));
        miasta2.add(new Miasto("Warszawa", 15, 4));
        miasta2.add(new Miasto("Krakow", 2, 7));
        miasta2.add(new Miasto("Honolulu", 4, 2));
        miasta2.remove(2);


//        miasta[0] = new Miasto("Londyn", 10, 5.5);
//        miasta[1] = new Miasto("Bangladesh", 30, 1);
//        miasta[2] = new Miasto("Warszawa", 15, 4);
    }

    public int podajTemperature(String konsola) {

        for (Miasto miasto : miasta2) {
            System.out.println(miasto.miasto);
            if (miasto.miasto.equals(konsola)) {
                System.out.println(miasto.temperatura);
                jest = true;
                return miasto.temperatura;
            }
        }
//        for (int komorka=0; komorka<miasta.length; komorka++){
//            if(miasta[komorka]==null){
//                break;
//            }
//            System.out.println(miasta[komorka].miasto);
//
//
//            if (miasta[komorka].miasto.equals(konsola)){
//                jest = true;
//                return miasta[komorka].temperatura;
//
//
//            }
//        }
        jest = false;
        return 42;
    }
}

class Termometr {
    int temperaturaCel = 20;
    int temperaturaFar = 80;
    float stopnie = 7.5f;
    public int getTemperatura(boolean cel) {
        if (cel) {
            return temperaturaCel;
        }
        return temperaturaFar;
    }
    public float scalaBof() {
        return stopnie;
    }
}
