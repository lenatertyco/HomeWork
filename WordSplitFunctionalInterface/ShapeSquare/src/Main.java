public class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle("circle", 10);
        Shape s2 = new Rectange("rectange", 4, 6);
        Shape s3 = new Square("square", 5);
        Shape s4 = new Triangle("triangle", 7, 9);

        Shape shapes[] = {s1, s2, s3, s4};
        Shape max = maxSquare(shapes);
        System.out.println("Max Square is " + max);
    }



public static Shape maxSquare(Shape [] shapes){
   // for (int i=1; i<shapes.length; i++){
     //   if (shapes[i].calculateSquare() > max){
       //         max = shapes [i].calculateSquare();
Shape max = shapes [0];
  for (Shape shape:shapes){
    if (shape.calculateSquare()>max.calculateSquare()) {
        max = shape;
    }
  }
return max;

    }
}
