package Interfacy;

import java.util.List;

public class WyszukiwarkaBalonow {

    public void wyszukajBalon(List<ColorFullThins> colors){
        for(ColorFullThins color : colors ){


            if(color instanceof Balon){
                color.zmienKolor();
                ((Balon)color).lec();
            }
        }



    }


}
