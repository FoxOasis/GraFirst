package Interfacy;

public class Kot extends ColorFullThins {


    public Kot(String color) {
        this.color = color;

    }

    public void miau() {
        System.out.println("Jestem "+color+" "+this.getClass().getSimpleName()+" "+"mrauuuu");

    }

    @Override
    public void zmienKolor() {
        color = "czarny";
    }

}
