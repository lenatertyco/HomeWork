import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static Map<String, List<String>> createDict;

    static String [] dict = {"ivan", "vani", "navi","war", "raw"};

    public static void main(String[] args) {

        String test = alphabetize("ivan");
        System.out.println(test);

        createDict = createDict(dict);

        createDict.forEach((k, v) -> System.out.println(k + " "+ v));

        List<String> findAnagrams = findAnagrams("ivan");
        System.out.println(findAnagrams);


    }

    public static String alphabetize (String input){
        char [] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String (charArray);
    }


public static Map<String, List<String>> createDict(String []voc) {
    //Map<String, List<String>> ret = new HashMap<>();
    return Arrays.asList(voc)
            .stream()
            .collect(Collectors.groupingBy(s -> Main.alphabetize(s)));
}


     /*   for (String s:voc){
            String alpha= alphabetize(s);
            List<String> list = ret.get(alpha);
            if (list==null){
                List<String> words = new LinkedList<>();
                words.add(s);
                ret.put(alpha, words);

            }else{
                list.add(s);

            }
        }
        return ret;
}
*/


    public static List<String> findAnagrams (String word){
        String alphabetize = alphabetize(word);
        return createDict.get(alphabetize);
    }
}

