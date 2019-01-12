public class VegetableProduct extends Product{

    double veganRate;

    public VegetableProduct(long barCode, String name, String category, String brand, double price, double veganRate) {
        super(barCode, name, category, brand, price);
        this.veganRate = veganRate;
    }
}
