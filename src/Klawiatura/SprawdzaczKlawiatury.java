package Klawiatura;

public class SprawdzaczKlawiatury {

    public String sprawdz(String slowo) {


        char[] znak = slowo.toCharArray();
        for (int i = 0; i < znak.length; i++) {

            if (Character.isDigit(znak[i])) {
              return "zawiera cyfre";
            }
        }
    return "nie zawiera cyfry";
    }
}
