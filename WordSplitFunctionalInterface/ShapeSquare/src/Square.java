public class Square extends Shape {

    private int a;
    private double s;
    public Square (String name, int a){
        super (name);
    }

    public double calculateSquare( ){
        s= a*a;
        return  s;
    }

    public int getA() {
        return a;
    }

    public double getS() {
        return s;
    }

    @Override
    public String toString() {
        return "Square" + "a=" + a + ", s=" + s ;
    }
}
