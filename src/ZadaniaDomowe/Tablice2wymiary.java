package ZadaniaDomowe;

public class Tablice2wymiary {
    public static void main(String[] args) {
        tabliczkaMnozenia();
    }
    public static void tabliczkaMnozenia() {
        int[][] tablicaMnozenia = new int[11][11];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                tablicaMnozenia[i][j] = i * j;
                System.out.print(tablicaMnozenia[i][j]);
            }
System.out.println();
        }
    }




}

