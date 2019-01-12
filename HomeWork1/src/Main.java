import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        try(BufferedReader br = new BufferedReader(new FileReader("List.txt"))){
            List<Person> collect = br.lines()
                    .map(Main::personFromString)
                    .sorted(Comparator.comparingInt(Person::getAge))
                    .filter(p -> p.getAge() > 17)
                    .collect(Collectors.toList());

            System.out.println(collect);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static Person personFromString (String input){
        String [] strings = input.split(",");
        Person person = new Person(strings[0], Integer.valueOf(strings[1]));

        return person;
    }

}
