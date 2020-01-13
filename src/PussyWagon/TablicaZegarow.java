package PussyWagon;

import java.util.Scanner;

public class TablicaZegarow {
    static Komputer komputer = new Komputer();
    static Scanner odczyt = new Scanner(System.in);
    static int ktoraOpcja = 0;

    public static void main(String[] args) {


        obslugaKonsoli();
        wyswietlacz();

    }

    public static void obslugaKonsoli() {
        System.out.println("Prosze wybrac jedna z 2 opcji");
        System.out.println("1 - wybor biegu");
        System.out.println("2 - prędkość");
        System.out.println("Po dokonaniu wyboru wpisz slowo \"jedz\"");

        String konsola = odczyt.nextLine();
        while (!konsola.contains("jedz")) {
            ktoraOpcja = Character.getNumericValue(konsola.charAt(0));
            System.out.println("Wybrales " + ktoraOpcja);
            if (ktoraOpcja == 1) {
                System.out.println("Podaj ktory bieg wybierasz od 1 do 3");
                komputer.ustawBieg(odczyt.nextInt());
            }
            if (ktoraOpcja == 2) {
                System.out.println("Podaj predkosc");
                komputer.ustawPredkosc(odczyt.nextInt());
            }
            konsola = odczyt.nextLine();
        }
    }

    public static void wyswietlacz() {
        if (ktoraOpcja == 1) {
            System.out.println("A wiec wybrales bieg " + komputer.bieg);
            System.out.println("Wiec przejedziesz :" + komputer.ilePrzejadeNaBiegu());

        }
        if (ktoraOpcja == 2) {
            System.out.println("A wiec wybrales predkosc " + komputer.predkosc);
            System.out.println("Wiec przejedziesz :" + komputer.ilePrzejadeNaBenie());

        }
    }
}
