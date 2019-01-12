import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {


        Person p1 = new Person("Ivan", "Sorokin", 32);
        Person p2 = new Person ("Roman", "Müllmann", 25);
        Person p3 = new Person ("Anna", "Smirnova", 40);
        Person p4 = new Person ("Olga", "Schmidt", 30);


        List<Person> personList = new Arrays.asList(p1, p2, p3, p4);

        Map<Integer, List<Person>> nameByAge = getNameByAge(personList);
        nameByAge.forEach((k, v) -> System.out.println(k + " " + v));

        }

        try(OutputStream os = new FileOutputStream( "C:\\Users\\lenat\\IdeaProjects\\HomeWorkIO4\\person.txt")){



    }


    public static Map<Integer, List<Person>> getNameByAge (List <Person> list) {

        return list
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));

    }


}
