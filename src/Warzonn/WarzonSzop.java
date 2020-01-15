package Warzonn;


import java.util.Scanner;

public class WarzonSzop {
    static Warehouse magazyn = new Warehouse();
    static Product[] listaProduktow = magazyn.getStock();
    static Product[] listaKoszyka = new Product[10];
    static Scanner odczyt = new Scanner(System.in);
    static int nrkoszka = 0;
    static double kwotaZakupu = 0;

    public static void main(String[] args) {
        powitanie();
        wyswietlStocka();
        listaKomend();
        obslugaKonsoli();
        coKupione();
    }

    public static void dodajProdukt(int indexProduktu) {
        listaKoszyka[nrkoszka] = magazyn.reduceStock(indexProduktu);
        nrkoszka++;
        System.out.println("dodano :" + indexProduktu);
    }
    public static void wyswietlStocka() {
        for (int i = 0; i < listaProduktow.length; i++) {
            System.out.print(i + "     ");
            System.out.print(listaProduktow[i].name + "         ");
            System.out.print(listaProduktow[i].price + "        ");
            System.out.print(listaProduktow[i].quantity + "     ");
            System.out.println();
        }
    }
    public static void coKupione() {
        for (int i = 0; i < listaKoszyka.length; i++) {
            if (listaKoszyka[i] == null) {
                break;
            }
            kwotaZakupu = kwotaZakupu + listaKoszyka[i].price;
            System.out.print(i + "     ");
            System.out.print(listaKoszyka[i].name + "         ");
            System.out.print(listaKoszyka[i].price + "        ");
            System.out.println();
        }
        System.out.println("Gratulujemy zmarnowales :" + kwotaZakupu);
    }

    public static void powitanie() {
        System.out.println("Siema w naszym szopie");
        System.out.println("Pamietaj Warzon iz da best");
        System.out.println("Mozesz kupic u nas takie lakocie");
        System.out.println("---------------------------------");
    }
    public static void listaKomend() {
        System.out.println("---------------------------------");
        System.out.println("Aby dodac do koszyka wpisz komende add");
        System.out.println("Aby byc szczesliwym posiadaczem stuffu wpisz buy");
    }
    public static void obslugaKonsoli() {
        String komenda = odczyt.nextLine();
        while (!komenda.contains("buy")) {
            System.out.println("komenda");
            if (komenda.contains("add")) {
                int indexProduktu = Character.getNumericValue(komenda.charAt(4));
                dodajProdukt(indexProduktu);
                wyswietlStocka();
            }
            komenda = odczyt.nextLine();
        }
    }
}



