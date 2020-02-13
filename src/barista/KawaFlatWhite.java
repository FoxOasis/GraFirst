package barista;

public class KawaFlatWhite extends Kawa implements Przepis{
    public KawaFlatWhite()
    {
        expresso = 2;
        mleko = 2;
    }

    @Override
    public String jakZrobiona() {
        przepis = "Na początku przygotuj podwójne espresso — w tym celu możesz wykorzystać ekspres do kawy lub kawiarkę (podwójne espresso to 60 ml skoncentrowanej kawy).\n" +
                "Podgrzewamy mleko do temperatury 60-70 stopni Celsjusza. Przy gotowaniu mleka należy uważać, żeby nie doprowadzić go do wrzenia. W przeciwnym razie nie będziemy mogli prawidłowo przyrządzić kawy flat white.\n" +
                "W tym kroku możesz (opcjonalnie) bardzo lekko spienić mleko — w tym celu najlepiej użyć spieniacza elektrycznego lub spieniacza ręcznego. Dobrym pomysłem jest również przelanie mleka do małego zamykanego pojemnika i potrząśnięcie nim kilka razy.\n" +
                "Na samym końcu należy przelać mleko do filiżanki z espresso.\n" +
                "Kawa flat white — jak ją podawać?";
        return przepis;
    }
}
