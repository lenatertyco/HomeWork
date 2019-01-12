public class BankAccount {

    String IBANN;
    Person owner;

    public BankAccount (String IBANN, Person owner){
        this.IBANN = IBANN;
        this.owner = owner;
    }

    public String getIBANN() {
        return IBANN;
    }

    public void setIBANN(String IBANN) {
        this.IBANN = IBANN;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "IBANN='" + IBANN + '\'' +
                ", owner=" + owner +
                '}';
    }
}
