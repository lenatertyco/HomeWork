import java.util.Objects;

public class Address {

    private String street;
    private int houseNumber;

    public Address (String street, int houseNumber){
        this.street = street;
        this.houseNumber = houseNumber;

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return houseNumber == address.houseNumber &&
                Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, houseNumber);
    }

    @Override
    public String toString() {
        return "Address{" + "street" + street +" " + "houseNumber=" + houseNumber + "}";
    }
}
