public class Boy extends Person {

    boolean male;

    public Boy(String name, int age) {
        super(name, age);
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
