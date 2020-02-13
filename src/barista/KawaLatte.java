package barista;

public class KawaLatte extends Kawa implements Przepis {
    public KawaLatte() {
        expresso++;
        mleko++;
    }

    @Override
    public String jakZrobiona() {
        przepis = "Zaparz mokkę w kawiarce lub podwójne espresso w ekspresie ciśnieniowym.\n" +
                "Spieniaczem ubij ok. 150-200 ml mleka - bardzo tłustego (3,2%) i podgrzanego do temperatury bliskiej 60 stopni Celsjusza.\n" +
                "Odstaw spienione mleko na bok i kilkakrotnie, delikatnie uderz naczyniem o blat.\n" +
                "Do pustej szklanki dodaj trochę syropu smakowego.\n" +
                "Łyżeczką przelej spienione mleko, tak aby nie wymieszało się z syropem.\n" +
                "Dodaj napar z kawy. Wlej kawę wolno do szklanki. Powstały po kawie ślad zakryj mleczną pianką.\n" +
                "Ozdób latte kakao lub cynamonem przy pomocy dekoratora do kawy. ";

        return przepis;
    }
}
