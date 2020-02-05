package Klawiatura;

import java.util.ArrayList;

public class Main {
    static SluchaczKlawiatury sluchacz = new SluchaczKlawiatury();
    static SprawdzaczKlawiatury sprawdzacz = new SprawdzaczKlawiatury();

    public static void main(String[] args) {
        sluchacz.start();
        for (String wyraz : sluchacz.slowa) {
            System.out.println(wyraz + " " + sprawdzacz.sprawdz(wyraz));
        }
    }
}
