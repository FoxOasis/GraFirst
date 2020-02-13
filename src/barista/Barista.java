package barista;

public class Barista {
    public Kawa makeCoffe(String typ) {
        if (typ.equals("flatwhite")) {

            return new KawaFlatWhite();

        } else if (typ.equals("latte")) {

            return new KawaLatte();
        } else if (typ.equals("czarna")) {
            return new Czarna();

        } else throw new IllegalStateException("wybrales zla kawe");


    }



}
