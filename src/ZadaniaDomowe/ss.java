package ZadaniaDomowe;

import java.util.Scanner;

public class ss {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        double price = 0;
        double reve = 0;
        int ilosc = 0;
        double procenty = 0.1;
        System.out.println(procenty);
        System.out.println("podaj ilosc");
        ilosc = odczyt.nextInt();
        System.out.println("podaj cene");
        price = odczyt.nextDouble();
        reve = price * ilosc;
        if (reve > 5000) {
            reve = reve - (reve * procenty);
            System.out.println("Wartosc = " + reve + " udzielono 10% rabatu");
        } else {
            System.out.println("Wartosc = " + reve);
        }
    }
}

