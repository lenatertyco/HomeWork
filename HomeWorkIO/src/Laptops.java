import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class Laptops {

    public static void main(String[] args)throws FileNotFoundException, IOException {

        try(BufferedReader br = new BufferedReader(new FileReader("Laptop.txt"));
            PrintWriter pw = new PrintWriter("person.txt")){
          Map<String, Integer> collect = br.lines()
                    .map(s -> personFromString(s))
                    .collect(Collectors.groupingBy(Person::getFullName, Collectors.summingInt(p ->p.getLaptop().getPrice())));
          Set<Entry<String, Integer>> entrySet = collect.entrySet();
          List<Entry<String, Integer>> entries = new ArrayList<>(entrySet);

          entries.sort(Entry.comparingByValue());
         // ((ArrayList) entries).forEach((e))-> pw.println((e.getKey()+ "," + e.getValue()));
          //entries.sort(Entry.comparingByKey());
          entries.forEach(e -> pw.println((e.getKey() + "," + e.getValue())));




    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person personFromString (String input){
        String [] strings = input.split(",");
        Laptop laptop = new Laptop (strings[2], Integer.valueOf(strings[3]));

        Person person = new Person(strings[0], strings[1], laptop);

        return person;
    }

}