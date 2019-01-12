public class Rectange extends Shape {

    private int a;
    private int b;
    private double s;
    public Rectange (String name, int a, int b){
        super (name);
    }

    public double calculateSquare( ){
        s= a*b;
        return s;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double getS() {
        return s;
    }

    @Override
    public String toString() {
        return "Rectange" + "a=" + a + ", b=" + b + ", s=" + s;
    }
}
