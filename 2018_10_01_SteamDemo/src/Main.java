import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> collect = asList.stream()
                .map(a -> a * 2)
                .filter(a -> a > 4)
                .collect(Collectors.toList());
        System.out.println(collect);

        String[] input = {"aaBc", "dEF", "eklm", "nop"};
        // ["def", "nop"]

        List<String> transform = transform(Arrays.asList(input));
        System.out.println(transform);
    }
    public static List<String> transform (List<String> input){
        List<String> output = input.stream()
                .filter(a ->a.length()==3)
                .map(a ->a.toLowerCase())
                .collect (Collectors.toList());
        return output;
        }

    }

