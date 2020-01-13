import java.util.Random;
import java.util.Scanner;

public class ZadniaDomowe2 {
    public static void main(String[] args) {

//        random();
    }

    public static void random() {
        Random rand = new Random();
        Scanner odczyt = new Scanner(System.in);
        int przypad = rand.nextInt();
        System.out.println(przypad);
        boolean wygrana = false;
        while (wygrana == false) {
           int liczbaU = odczyt.nextInt();

            if (liczbaU == przypad) {
                wygrana = true;
            } if (liczbaU > przypad) {
                System.out.println("za wysoko");
            } if (liczbaU < przypad) {
                System.out.println("za nisko");
            }

        }
        System.out.println("udalo Ci sie ");
    }



}



