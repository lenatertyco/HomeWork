public class Supermarket {

Product [] products;
int capacity;
public Supermarket (int capacity) {
    products = new Product[capacity];
}


    public boolean addProduct (Product product) {
        if (capacity < products.length) {
            products[capacity] = product;
            capacity++;
            return true;
        }
        return false;
    }


    public boolean removeProduct (long barCode){



    }

    public boolean findByBarCode (long barCode){

        Product[] res = new Product[capacity];
        for (int i=0; i< capacity; i++){
            res[i]=products[i];
        }


    }
    public Product [] findByCategory (String category, int numberOfItems){


    }


    public Product [] findByBrand (String brand, int numberOgItems){

    }



}
