package barista;

public class Czarna extends Kawa implements Przepis {
    public Czarna() {
        expresso = 3;
    }

    @Override
    public String jakZrobiona() {
        przepis = "wszystkie składniki miksować przez 2 lub 1 minute.\n" +
                "potem napój przelać do szklanki,pozostawiając miejsce na dekoracje.\n" +
                "napój udekorować bitą śmietaną i 1 biszkoptem.";


        return przepis;
    }
}
