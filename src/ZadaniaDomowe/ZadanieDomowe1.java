package ZadaniaDomowe;

import java.util.Scanner;

public class ZadanieDomowe1 {
    public static void main(String[] args) {
//        sumawanie();
//        parzyste();
//        najnaj();
        najanj2();
    }

    public static void sumawanie() {
        Scanner odczyt = new Scanner(System.in);
        int sumaDodatanich = 0;
        int sumaUjemnych = 0;
        int ileDodatnich = 0;
        int ileUjemnych = 0;
        int ileZero = 0;
        while (odczyt.hasNextInt()) {
            int liczbyWprowadzone = odczyt.nextInt();
            if (liczbyWprowadzone == 0) {
                ileZero++;
            } else if (liczbyWprowadzone < 0) {
                sumaUjemnych = sumaUjemnych + liczbyWprowadzone;
                ileUjemnych++;
            } else {
                sumaDodatanich = sumaDodatanich + liczbyWprowadzone;
                ileDodatnich++;
            }
        }
        System.out.println("Wykryłem " + ileDodatnich + " liczb dodatnich a ich suma to: " + sumaDodatanich);
        System.out.println("Wykryłem " + ileUjemnych + " liczb ujemnych a ich suma to: " + sumaUjemnych);
        System.out.println("Zer było :" + ileZero);
    }

    public static void parzyste() {
        Scanner odczyt = new Scanner(System.in);
        int liczbyParzyste = 0;
        int liczbyNieparzyste = 0;
        int sumaParzystych = 0;
        int sumaNieparzystych = 0;
        while (odczyt.hasNextInt()) {
            int liczbyWprowadzane = odczyt.nextInt();
            if (liczbyWprowadzane % 2 == 0) {
                sumaParzystych = sumaParzystych + liczbyWprowadzane;
                liczbyParzyste++;
            } else {
                sumaNieparzystych = sumaNieparzystych + liczbyWprowadzane;
                liczbyNieparzyste++;
            }

        }
        System.out.println("Wykryłem " + liczbyParzyste + " liczb parzystych a ich suma to: " + sumaParzystych);
        System.out.println("Wykryłem " + liczbyNieparzyste + " liczb nieparzystych a ich suma to: " + sumaNieparzystych);
    }

    public static void najnaj() {
        Scanner odczyt = new Scanner(System.in);
        int liczbaNajWieksze = 0;
        int liczbaNajMniejsza = 0;
        int iloscWprowadzen = 0;
        while (odczyt.hasNextInt()) {
            int liczbyWprowadzane = odczyt.nextInt();
            iloscWprowadzen++;
            if (iloscWprowadzen == 1) {
                liczbaNajMniejsza = liczbyWprowadzane;
                liczbaNajWieksze = liczbyWprowadzane;
            } else {
                if (liczbyWprowadzane > liczbaNajWieksze) {
                    liczbaNajWieksze = liczbyWprowadzane;
                }
                if (liczbyWprowadzane < liczbaNajMniejsza) {
                    liczbaNajMniejsza = liczbyWprowadzane;
                }
            }
        }
        System.out.println("Najwieksza wprowadzona liczba to: " + liczbaNajWieksze);
        System.out.println("Najmniejsza wprowadzona liczba to: " + liczbaNajMniejsza);
    }

    public static void najanj2() {
        int liczbaNajWieksze = Integer.MIN_VALUE;
        int liczbaNajMniejsza = Integer.MAX_VALUE;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Działa miedzy : " +(Integer.MAX_VALUE-1)+ " a "+(Integer.MIN_VALUE+1));
        while (odczyt.hasNextInt()) {
            int liczbyWprowadzane = odczyt.nextInt();{
                if (liczbyWprowadzane > liczbaNajWieksze) {
                    liczbaNajWieksze = liczbyWprowadzane;
                }
                if (liczbyWprowadzane < liczbaNajMniejsza) {
                    liczbaNajMniejsza = liczbyWprowadzane;
                }
            }
        }
        if ((liczbaNajMniejsza == Integer.MAX_VALUE) && (liczbaNajWieksze == Integer.MIN_VALUE)) {
            System.out.println("Nie wprowadziles zadnej cyfry");
        }else{
            System.out.println("Najwieksza wprowadzona liczba to: " + liczbaNajWieksze);
            System.out.println("Najmniejsza wprowadzona liczba to: " + liczbaNajMniejsza);
        }
    }
}
