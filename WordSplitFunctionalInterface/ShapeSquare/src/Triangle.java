public class Triangle extends Shape {

    private int a;
    private int b;
    private double s;
    Triangle (String name, int a, int b){
        super (name);
    }
@Override
    public double calculateSquare(){
        s=a*b;
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
        return "Triangle" + "a=" + a + ", b=" + b + ", s=" + s;
    }
}
