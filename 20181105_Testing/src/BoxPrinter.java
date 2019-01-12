import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class BoxPrinter <T>{
    //public class BoxPrinter <T,R>{
T value;
//R value2;
//Parametrizacija
    //public BoxPrinter(T value) {
     //   this.value = value;
   // }

    //************
    //List<? extends Number> list3 =new ArrayList<Integer> ();
    //mozhno i prosto <?>
    //list3 = new ArrayList<String>();
    //list3.add
    //*****

    public void setValue(T value) {
        //public void setValue(T value, R value2) {
        this.value = value;
        //this.value2 = value2;
    }

    public String getValue() {
        //Dolzhen tozhe but' parametr T, no mozhno String, esli v reurn vuzvat metod toString
        return value.toString();
    }

    public static void main(String[] args) {

        //Function<String, Integer> f = s -> s.length();
        //Function<String, Integer> f = new Funktion<String, Integer>();
        //public Integer apply(String value ){
          //      return value.lenght();
        }

        //BoxPrinter<String> printer = new BoxPrinter<>("Hello word");

        BoxPrinter<String> printer = new BoxPrinter<>();
        printer.setValue("Hello Word");


        //v new Boxprinter <PUSTO> parametr opredeljaetsja avtomaticheski
        //String value2 = printer.getValue();

        //BoxPrinter<Integer> integerBoxPrinter = new BoxPrinter<>(10);
        BoxPrinter<Integer> integerBoxPrinter = new BoxPrinter<>();
        integerBoxPrinter.setValue(10);


        //BoxPrinter<Double> doubleBoxPrinter = new BoxPrinter<>(10D);

        BoxPrinter<Letter> letterPrinter = new BoxPrinter<>();
        letterPrinter.setValue(new Letter("Hello word!"));
        String value3 = letterPrinter.getValue();
        System.out.println(value3);
        //v sout nevozmozhno srazu vuzvat getValue, t.k javljaetsja tipom Letter, a nam nuzhno String.



    public static List list =new LinkedList<>();

    public static void addToList (String value){
        list.add(value);
    }

}


