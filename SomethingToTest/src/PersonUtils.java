import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonUtils {
    String name;
    String address;
    int age;

    public PersonUtils (String name, String address, Integer age){
        this.name = name;
        this.address = address;
        this.age = age;

    }


        public static String noDuplicateNames(String names) {

            List<String> namesList = Arrays.asList(names.split(" "));

            return namesList.stream().collect(Collectors.toSet()).toString();

        }



        public static List<Address> getAddresses(List<PersonUtils> persons) {

            return persons
                    .stream()
                    .filter(p -> p.getAge() > 17)
                    .map(p -> p.getAddress())
                    .collect(Collectors.toList());

        }



        public static int sumAge(List<PersonUtils> persons) {



            return persons.stream()

                    .filter(p -> p.getAge() > 17)

                    .reduce(0, (a, b) -> a + b.getAge(), (a, b) -> a + b);



        }



        public static Map<Integer, List<PersonUtils>> getPersonsByAge(List<PersonUtils> persons) {

            return persons
                    .stream()
                    .collect(Collectors.groupingBy(PersonUtils::getAge));

        }



        public static long countWordsByCharacter(String sentence, String a) {

            List<String> asList = Arrays.asList(sentence.split(" "));

            return asList
                    .stream().map(s -> s.toLowerCase())
                    .filter(s -> s.startsWith(a)).count();

        }



        public static String ofLegalAge(List<PersonUtils> persons) {

            return persons.stream()

                    .filter(p -> p.getAge() > 17)

                    .map(PersonUtils::getName)

                    .collect(Collectors.joining(" and ", "In Germany ", " are of legal age"));

        }

    }
