import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.*;

public class TransformerMain {

    public static void main(String[] args) {

        String input = "fdk kasso kwdwOisu";

        Predicate<String> p = s -> s.length()==3;
        Function <String, String> f = s -> s.toUpperCase();
        //Consumer<String> c = s -> System.out.println(s);
        //c.accept("Hello world");

        Consumer<String> c = s -> System.out.println("***"+ s+ "++++");
        printSmth(c, "Hello world");


        Supplier<String> supp = ()-> "HEllo World";
        System.out.println(supp.get());
    }

    public static void printSmth(Consumer<String> printer, String something ){
        printer.accept(something);
    }

    public static String transform(String sentence, Predicate<String> p, Function<String,String> f){
       String [] words = sentence.split (" ");
       for(int i=0; i<words.length;i++){
           if (words[i].length()==3){
               words[i] = words[i].toUpperCase();
           }

       }
        return String.join(" ", words);
    }
}
