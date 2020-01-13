package Ludzik;

import java.util.Random;
import java.util.Scanner;

public class Mapa {
    static String[][] plansza = new String[9][18];
    static Scanner odczyt = new Scanner(System.in);
    static int wiersz = 0;
    static int kolumny = 0;
    static int pozycjax = 5;
    static int pozycjay = 5;
    static int pozycjaMobX = 0;
    static int pozycjaMobY = 0;
    static int wynik = 0;
    static Random rand = new Random();

    public static void main(String[] args) {
        ramkaMapy();
        polaMapy();
        randMob();
        wyswietlanie();
        inputUsera();
    }

    private static void inputUsera() {
        String konsola;
        while (wynik != 3) {
            konsola = odczyt.next();
            plansza[pozycjax][pozycjay] = " ";
            if (konsola.contains("w")) {
                if (pozycjax != 1) {
                    pozycjax = pozycjax - 1;
                }
            }
            if (konsola.contains("s")) {
                if (pozycjax != plansza.length - 2) {
                    pozycjax = pozycjax + 1;
                }
            }
            if (konsola.contains("a")) {
                if (pozycjay != 1) {
                    pozycjay = pozycjay - 1;
                }
            }
            if (konsola.contains("d")) {
                if (pozycjay != plansza[0].length - 2) {
                    pozycjay = pozycjay + 1;
                }
            }
            if (plansza[pozycjax][pozycjay].contains("@")) {
                wynik += 1;
                System.out.println(wynik);
            }
            plansza[pozycjax][pozycjay] = "F";
            wyswietlanie();
        }
    }


    public static void ramkaMapy() {
        for (int wiersz = 0; wiersz < plansza.length; wiersz++) {
            plansza[wiersz][0] = "*";
            plansza[wiersz][plansza[0].length - 1] = "*";
        }
        for (int kolumny = 0; kolumny < plansza[0].length; kolumny++) {
            plansza[0][kolumny] = "*";
            plansza[plansza.length - 1][kolumny] = "*";
        }
    }

    public static void polaMapy() {
        for (wiersz = 1; wiersz < plansza.length - 1; wiersz++) {
            for (kolumny = 1; kolumny < plansza[0].length - 1; kolumny++) {
                plansza[wiersz][kolumny] = " ";
            }
        }
        plansza[pozycjax][pozycjay] = "F";
    }

    public static void wyswietlanie() {
        for (int wiersz = 0; wiersz < plansza.length; wiersz++) {

            for (int kolumna = 0; kolumna < plansza[wiersz].length; kolumna++) {
                System.out.print(plansza[wiersz][kolumna]);
            }
            System.out.println();
        }
    }

    public static void randMob() {
        for (int ileMob = 0; ileMob < 3; ileMob++) {
            pozycjaMobX = rand.nextInt(plansza.length - 2) + 1;
            pozycjaMobY = rand.nextInt(plansza[0].length - 2) + 1;
            plansza[pozycjaMobX][pozycjaMobY] = "@";
        }
    }
}