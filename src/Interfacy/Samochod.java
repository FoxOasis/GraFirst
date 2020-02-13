package Interfacy;

public class Samochod extends ColorFullThins {


    public Samochod(String color) {
        this.color = color;
    }
public void jedz(){
        System.out.println("Jestem "+color+" "+this.getClass().getSimpleName()+" "+"bruuum");
}

    @Override
    public void zmienKolor() {
        color = "zielony";
    }



}
