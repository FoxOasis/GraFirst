package barista;

public class Kawiarnia {
    public static void main(String[] args) {
        Barista barista = new Barista();
        Kawa kawa = barista.makeCoffe("flatwhite");

        System.out.println("Prosze to Twoja: " + kawa.getClass().getSimpleName() + " kawa skladnikami sa: " + kawa.expresso + " espresso i " + kawa.mleko + " mleka");
        System.out.println(((Przepis)kawa).jakZrobiona());
    }
}
