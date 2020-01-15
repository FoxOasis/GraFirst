package Warzonn;

public class Warehouse {
    Product[] stock = new Product[10];


    public Warehouse() {
        stock[0] = new Product("japko   ", 2.5, 10);
        stock[1] = new Product("marchew ", 3, 30);
        stock[2] = new Product("mlotek  ", 33.5, 3);
        stock[3] = new Product("nausznik", 13.7, 45);
        stock[4] = new Product("korek   ", 23.5, 48);
        stock[5] = new Product("stanik  ", 40, 9);
        stock[6] = new Product("zdrowie ", 150, 24);
        stock[7] = new Product("parasol ", 22, 12);
        stock[8] = new Product("magicBox", 50, 33);
        stock[9] = new Product("burak   ", 4.2, 15);
    }
    public Product[] getStock() {
        return stock;
    }
    public Product reduceStock(int indexProduktu){
        stock[indexProduktu].quantity -= 1;
        return stock[indexProduktu];
    }
}
