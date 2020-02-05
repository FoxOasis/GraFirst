package Klawiatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SluchaczKlawiatury {
    Scanner odczyt = new Scanner(System.in);
    List<String> slowa = new ArrayList<>();

    public void start() {
        String konsola = " ";

//        do {
//            konsola = odczyt.nextLine();
//            slowa.add(konsola);
//        }
//        while (!konsola.equals("koniec"));


        while (!konsola.equals("koniec")) {
            konsola = odczyt.nextLine();
        if(konsola.equals("koniec")){
        }else{
            slowa.add(konsola);
        }
        }
    }
}
