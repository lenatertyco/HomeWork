import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        Map<String, String> map = new HashMap<>();
        map.put("a", "Hello");
        map.put("b", "World");

        // "ab" -> "HelloWorld"

        Map<String, String> abMap = getABMap(map, "a", "b");
        System.out.println(abMap);

        String [] worldMultiple = {"a","b", "a", "c","b"};
        Map<String, Boolean> booleanMap = getBooleanMap(worldMultiple);
        System.out.println(booleanMap);


        Integer max = getMax("Numbers");
        System.out.println("DIFF" + max);

    }

    public static Integer getMax(String fileName) {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            List<Integer> collect = br.lines().map(Integer::parseInt).sorted().collect(Collectors.toList());
            if(collect.size()==0) {
                return 0;
            }

            return collect.get(collect.size() -1) - collect.get(0);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static Map<String, String> getABMap(Map<String, String> map, String a, String b){

             if(map.containsKey("a")&& map.containsKey("b")){
                 map.put("ab", map.get("a")+map.get("b"));
        }
            return map;
    }

    public static Map<String, Boolean> getBooleanMap (String [] input ) {

        Map<String, Boolean> map = new HashMap<>();
        for(String s:input) {
            if(map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }
        return map;
    }




}
