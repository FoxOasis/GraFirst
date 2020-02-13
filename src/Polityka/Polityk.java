package Polityka;

public class Polityk {
    private Klamanie narod;

    public Polityk(Klamanie narod) {
        this.narod = narod;
    }

    public void mow() {

        System.out.println(narod.klamanie());
    }
}
