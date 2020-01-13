package PussyWagon;

public class Komputer {

    int benzyna = 100;
    int bieg = 0;
    double predkosc = 0;
    double odleglosc = 0;


    public double ilePrzejadeNaBiegu() {
        odleglosc = bieg * 10.14;
        return odleglosc;

    }

    public int ileBenzyny() {

        return benzyna;
    }

    public int ktoryBieg() {
        return bieg;
    }

    public void ustawBieg(int wybranyBieg) {
        bieg = wybranyBieg;
    }

    public void ustawPredkosc(int nowaPredkosc) {
        predkosc = nowaPredkosc;
    }


    public double ilePrzejadeNaBenie() {
        odleglosc = predkosc * 0.15;
        return odleglosc;
    }
}

