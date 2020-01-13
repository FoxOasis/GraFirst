import java.util.Scanner;

public class Petelka {
    public static void main(String[] args) {
        //       zapytanieOImie();
        //       petla();
        suma();
        bombka1();
        bomba2();
        bomba3();
    }

    public static void bombka1() {
        Scanner odczyt = new Scanner(System.in);
        int czas = odczyt.nextInt();
        for (int i = czas; i >= 0; i -= 1) {
            System.out.println("Wybuch za" + i);
        }
    }

    public static void bomba2() {
        Scanner odczyt = new Scanner(System.in);
        int czas = odczyt.nextInt();
        int i = czas;
        while (i >= 0) {
            System.out.println("Wybuch2 za" + i);
            i--;
        }
    }

    public static void bomba3() {
        Scanner odczyt = new Scanner(System.in);
        int i = odczyt.nextInt();
        do {
            System.out.println("Wybuch2 za" + i);
            i--;
        }
        while (i >= 0);
    }

    public static void zapytanieOImie() {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Jak Cię zwą wedrowcze?");
        String imie = odczyt.next();
        System.out.println("Witaj " + imie);
        for (int i = 0; i < 10; i++) {
            System.out.println("siema" + i);
        }
    }

    public static void petla() {
        Scanner odczyt = new Scanner(System.in);
        final int liczba = odczyt.nextInt();
        for (int i = liczba; i >= 0; i = i - 10) {
            if (i > 35) {
                i -= 7;
            }
            System.out.println(i);
        }
    }

    public static void suma() {
        Scanner odczyt = new Scanner(System.in);
        final int liczba = odczyt.nextInt();
        int suma = 0;
        suma = suma + liczba;
        System.out.println(suma);
    }
}

