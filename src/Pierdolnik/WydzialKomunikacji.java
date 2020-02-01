package Pierdolnik;

import java.util.Scanner;

public class WydzialKomunikacji {
    static Scanner odczyt = new Scanner(System.in);
    static Baza baza = new Baza();


    public static void main(String[] args) {
        String typ;
        String nazwisko;
        String naped;
        int pojemnosc;
        //Przywitanie
        //poproszenie o danie i ich przyjecie
        //podziekowanie
        System.out.println("Witamy w wydziale komunikacji w psinu dolnym");
        System.out.println("W naszym wspaniałym miescie rowniez rejestrujemy rowery");


        for (int i = 0; i < 3; i++) {
            typ = podajTyp();
            if (typ.equals("koniec")) {
                break;
            }
            System.out.println("Podaj Nazwisko ");
            nazwisko = podajNazwisko();
            System.out.println("podaj rodzaj napedu");
            naped = podajNaped();
            if (!naped.equals("brak")) {
                System.out.println("podaj pojemnosc");
                pojemnosc = odczyt.nextInt();
            } else {
                pojemnosc = 0;
            }


            dodaniePojazdu(typ, nazwisko, naped, pojemnosc);

        }
        wyswietlBaze();

    }

    public static String podajTyp() {
        System.out.println("Prosze podaj jaki typ pojazdu chcesz zarejestrowac");
        System.out.println("dostepne mozliwosci : s - samochod, r - rower, m - motąg");
        return odczyt.next();

    }

    public static String podajNazwisko() {

        return odczyt.next();
    }

    public static String podajNaped() {

        return odczyt.next();
    }


    public static void dodaniePojazdu(String typ, String nazwisko, String naped, int pojemnosc) {
        baza.spisPojazdow.add(new Pojazd(typ, nazwisko, naped, pojemnosc));
    }

    public static void wyswietlBaze() {
        for (Pojazd typ : baza.spisPojazdow) {
            System.out.println(typ.typ + " " + typ.daneWlasciciela + " " + typ.rodzajSilnika + " " + typ.pojemnosc);
        }
    }

}
