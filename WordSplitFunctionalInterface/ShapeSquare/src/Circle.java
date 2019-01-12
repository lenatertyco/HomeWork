public class Circle extends Shape {

    private double s;
    private double r;
    public Circle (String name, double r){
        super (name);
        this.r=r;
    }

    private static double p = 3.14;

    @Override
public double calculateSquare(){
    s= r*p;
    return s;
}

    public double getS() {
        return s;
    }

    public double getR() {
        return r;
    }

    public static double getP() {
        return p;
    }


    public String toString() {
        return "Circle" + "s=" + s + ", r=" + r ;
    }
}
