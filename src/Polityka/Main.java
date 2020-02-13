package Polityka;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Polityk francuski = new Polityk(new Francuski());
        Polityk angielski = new Polityk(new Angielski());
        List<Polityk> sejm = new ArrayList<>();
        sejm.add(francuski);
        sejm.add(angielski);
        francuski.mow();
        angielski.mow();

        for(Polityk narod : sejm){
          narod.mow();
        }
    }
}
