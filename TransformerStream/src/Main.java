import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {

    }

    public static String transform (String sentence,
                                    Function<String, String> f,
                                    Predicate<String> p){
        String [] words = sentence.split(" ");
        Stream <String> streamOfStrings = Stream.of(words);
        return streamOfStrings
                .map(s-> p.test(s)?f.apply(s):s)
                .collect(Collectors.joining(" , "));


    }
}
