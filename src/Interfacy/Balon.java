package Interfacy;

public class Balon extends ColorFullThins {

    public Balon(String color){
        this.color = color;

    }
    public void lec(){
        System.out.println("Jestem "+color+" "+this.getClass().getSimpleName()+" fruuu");
    }

    @Override
    public void zmienKolor() {
        color = "niebieski";
    }

}
