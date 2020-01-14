package Ludzik;

import java.util.Random;
import java.util.Scanner;

public class Mapa {
    static String[][] plansza = new String[9][18];
    static String[][] skarby = new String[9][18];
    static Scanner odczyt = new Scanner(System.in);
    static int wiersz = 0;
    static int kolumny = 0;
    static int pozycjax = 5;
    static int pozycjay = 5;
    static int pozycjaZnajdzkiX = 0;
    static int pozycjaZnajdzkiY = 0;
    static int pozycjaMobX = 0;
    static int pozycjaMobY = 0;
    static int wynik = 0;
    static String skarb = "+";
    static String gracz = "F";
    static String mob = "&";
    static Random rand = new Random();


    public static void main(String[] args) {
        ramkaMapy();
        polaMapy();
        randZnajdzka();
        randMob();
        skarby();
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
            if (plansza[pozycjax][pozycjay].contains("+")) {
                wynik += 1;
                System.out.println(wynik);
            }
            plansza[pozycjax][pozycjay] = gracz;

            ruchMoba();
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
        plansza[pozycjax][pozycjay] = gracz;
    }

    public static void wyswietlanie() {
        for (int wiersz = 0; wiersz < plansza.length; wiersz++) {
            for (int kolumna = 0; kolumna < plansza[wiersz].length; kolumna++) {
                System.out.print(plansza[wiersz][kolumna]);
            }
            System.out.println();
        }
    }

    public static void randZnajdzka() {
        for (int ileZnajdzek = 0; ileZnajdzek < 3; ileZnajdzek++) {
            pozycjaZnajdzkiX = rand.nextInt(skarby.length - 2) + 1;
            pozycjaZnajdzkiY = rand.nextInt(skarby[0].length - 2) + 1;
            skarby[pozycjaZnajdzkiX][pozycjaZnajdzkiY] = skarb;
        }
    }

    public static void randMob() {
        for (int ileMob = 0; ileMob < 1; ileMob++) {
            pozycjaMobX = rand.nextInt(plansza.length - 2) + 1;
            pozycjaMobY = rand.nextInt(plansza[0].length - 2) + 1;
            plansza[pozycjaMobX][pozycjaMobY] = mob;
        }
    }

    public static void ruchMoba() {
        boolean goraDol = rand.nextBoolean();
        plansza[pozycjaMobX][pozycjaMobY] = " ";
        if (goraDol) {
            if (pozycjaMobX > pozycjax) {
                pozycjaMobX -= 1;
            }
            if (pozycjaMobX < pozycjax) {
                pozycjaMobX += 1;
            }
        } else {
            if (pozycjaMobY > pozycjay) {
                pozycjaMobY -= 1;
            }
            if (pozycjaMobY < pozycjay) {
                pozycjaMobY += 1;
            }
        }
        plansza[pozycjaMobX][pozycjaMobY] = mob;
    }

    public static void skarby() {
        for (int wiersz = 0; wiersz < skarby.length; wiersz++) {
            for (int kolumna = 0; kolumna < skarby[wiersz].length; kolumna++) {
                if (skarby[wiersz][kolumna] != null && skarby[wiersz][kolumna].contains(skarb)) {
                    plansza[wiersz][kolumna] = skarby[wiersz][kolumna];
                }
            }
        }
    }
}