public class Person {

    private String firstName;
    private String lastName;
    private Laptop laptop;

    public Person (String firstName, String lastName, Laptop laptop ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.laptop = laptop;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", laptop=" + laptop +
                '}';
    }

    public String getFullName(){
        return firstName +" "+ lastName;
    }

}
