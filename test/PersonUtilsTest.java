import de.telran.PersonUtils;
import de.telran.model.Address;
import de.telran.model.Person;
import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

public class PersonUtilsTest {

    @Test
    public void testSomething() {
        long count = PersonUtils.countWordsByCharacter("aa ab abcd ss zest", "a");
        assertEquals("count", 3, count);
    }

    @Test
    public void testAddress (){
        Address a1 =new Address("Street 1", 25);
        Address a2 = new Address("Street 2", 23);

        List<Person> persons = new LinkedList<>();
        persons.add(new Person("Ivan", 30, a1));
        persons.add(new Person("Ivan", 25, a2));

        List<Address> addresses = new LinkedList<>();
        addresses.add(a1);

        addresses.add(a2);

        List<Address> actual = PersonUtils.getAddresses(persons);
        assertEquals("addresses", addresses, actual );
    }


    @Test(expected = NullPointerException.class)
    public void addressesListNotNull (){

        PersonUtils.getAddresses(null);
    }

    @Test
    public void testOfLegalAge (){

        Address a1 =new Address("Street 1", 25);
        Address a2 = new Address("Street 2", 23);

        List<Person> persons = new LinkedList<>();
        persons.add(new Person("Slava", 30, a1));
        persons.add(new Person("Ivan", 15, a2));
        persons.add(new Person("Olga", 29, a1));

        String actual;
        actual = PersonUtils.ofLegalAge(persons);
        assertEquals("legal age", persons.get(0).getName(), actual.substring(11, 16));
        assertThat(actual, containsString ( "Olga") );
    }
    @Test
    public void testSumAge (){
        Address a1 =new Address("Street 1", 25);
        Address a2 = new Address("Street 2", 23);

        List<Person> persons = new LinkedList<>();
        persons.add(new Person("Slava", 30, a1));
        persons.add(new Person("Ivan", 15, a2));
        persons.add(new Person("Olga", 10, a1));
        int input = 55;
        int actual = PersonUtils.sumAge(persons);

        assertEquals("sum age",55, actual);

    }
    @Test
    public void testGetPersonsByAge (){
        Address a1 =new Address("Street 1", 25);
        Address a2 = new Address("Street 2", 23);

        List<Person> persons = new LinkedList<>();
        persons.add(new Person("Slava", 30, a1));
        persons.add(new Person("Ivan", 15, a2));

        Map <Integer, List<Person>> input = new HashMap<>();
        input.put(30, (List<Person>) persons.get(0));
        input.put(15, (List<Person>) persons.get(1));

        Map<Integer, List<Person>> actual = PersonUtils.getPersonsByAge(persons);
        assertEquals("the list of persons by age",actual, input);

    }

    @Test

    public void testNoDuplicateNames (){

        String input = "AAs AAs ooo kfd";
        String actual = PersonUtils.noDuplicateNames(input);

        assertNotEquals("no duplicate", actual, input);
        assertThat(actual, (any(String.class)));

    }
.
    @Test

    public void testCountWordsByCharacter (){
        String input = "amore ananas anna antoshka olga ganna";
        long source = 4;
        long actual = PersonUtils.countWordsByCharacter(input,"a");
        assertEquals("number of words", actual, source);

    }
}
