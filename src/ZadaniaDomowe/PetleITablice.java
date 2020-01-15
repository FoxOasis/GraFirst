package ZadaniaDomowe;

import java.util.Scanner;

public class PetleITablice {
    public static void main(String[] args) {

//        rysujWiechec();
//        rysujWiechecBack();
//        bedeMialCieDoscChoinko();
       // cyfrowaWiechec();

    }

    public static void rysujWiechec() {
        Scanner odczyt = new Scanner(System.in);
        int wysokosc = odczyt.nextInt();
        String galezie = "*";
        for (int i = 0; i < wysokosc; i++) {
            System.out.println(galezie);
            galezie = galezie + "*";
        }
    }

    public static void rysujWiechecBack() {
        Scanner odczyt = new Scanner(System.in);
        int wysokosc = odczyt.nextInt();
        String spacje = "";
        String galezie = "*";
        for (int i = 0; i < wysokosc; i++) {
            for (int j = wysokosc - 1; j > i; j--) {
                spacje = spacje + " ";
            }
            System.out.println(spacje + galezie);
            galezie = galezie + "*";
            spacje = "";
        }
    }

    public static void bedeMialCieDoscChoinko() {
        Scanner odczyt = new Scanner(System.in);
        int wysokosc = odczyt.nextInt();
        String spacje = "";
        String galezie = "*";
        for (int i = 0; i < wysokosc; i++) {
            for (int j = wysokosc - 1; j > i; j--) {
                spacje = spacje + " ";
            }
            System.out.println(spacje + galezie);
            galezie = galezie + "**";
            spacje = "";
        }
    }

    public static void cyfrowaWiechec() {
        Scanner odczyt = new Scanner(System.in);
        int wysokosc = odczyt.nextInt();
        String spacje = "";
        for (int i = 0; i < wysokosc; i++) {
            for (int j = wysokosc - 1; j > i; j--) {
                spacje = spacje + " ";
            }
            System.out.print(spacje);
            for (int k = -1; k <= (2 * i) - 1; k++) {
                System.out.print(i + 1);
            }
            System.out.println();
            spacje = "";
        }
    }




}