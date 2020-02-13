package Interfacy;

import java.util.List;

public class WyszukiwarkaSamochodow {

    public void wyszukajSamochodo(List<ColorFullThins> colors) {
        for (ColorFullThins color : colors) {

            if (color instanceof Samochod) {
                ((Samochod)color).zmienKolor();
                ((Samochod)color).jedz();


            }
        }


    }


}
