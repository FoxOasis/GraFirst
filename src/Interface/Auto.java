package Interface;

public class Auto {
    private Silnik silnik;

    public Auto(Silnik silnik) {
        this.silnik = silnik;
    }
    public void jedz() {
        System.out.println(silnik.dajGlos());
    }
}
