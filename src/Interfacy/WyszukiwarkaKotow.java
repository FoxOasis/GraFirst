package Interfacy;

import java.util.List;

public class WyszukiwarkaKotow {


    public void wyszukajKota(List<ColorFullThins> colors) {

        for (ColorFullThins color : colors){
            if (color instanceof Kot){

                Kot kot2 = (Kot) color;
                ((Kot)color).zmienKolor();
                ((Kot)color).miau();
            }

        }


    }


}
