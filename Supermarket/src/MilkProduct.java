public class MilkProduct extends Product {

    double fatPercent;

    public MilkProduct(long barCode, String name, String category, String brand, double price, double fatPercent) {
        super(barCode, name, category, brand, price);
        this.fatPercent=fatPercent;
    }
}
