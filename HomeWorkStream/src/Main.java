import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Address a1 = new Address("Friedrichstrasse", 10);
        Address a2 = new Address ("Gleimstr.", 59);
        Address a3 = new Address ("Parkstr.", 12);


        Person p1 = new Person("Sergey", 30, a1);
        Person p2 = new Person("Misha", 10, a2);
        Person p3 = new Person("Ivan", 20, a2);
        Person p4 = new Person ("Nina", 30, a3);
        Person p5 = new Person ("Alex", 30,a1);

        BankAccount b1 = new BankAccount("DE849850004", p1);
        BankAccount b2 = new BankAccount("NL858345988",p1);
        //BankAccount b3 = new BankAccount("IT36462537127",p2);
        //BankAccount b4 = new BankAccount("DE9121209", p2);

        List<BankAccount> bankAccountList1 = Arrays.asList(b1, b2);
        //List<BankAccount> bankAccountList2 = Arrays.asList(b3, b4);

        List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5);
        List<String> nameList = Arrays.asList("Misha", "Anton", "Sasha", "Alla","Misha");


        List<Address> AddressByAge = getAddressByAge(personList, 17);
        System.out.println(AddressByAge);

        List<String> name = getUniqName(nameList);
        System.out.println(name);

        Map<Integer, List<Person>> nameByAge = getNameByAge(personList);
        nameByAge.forEach((k, v) -> System.out.println(k + " " + v));


        Map<String, List<BankAccount>> bankAccountByName = getBankAccountByName(bankAccountList1);
        bankAccountByName.forEach((k, v) -> System.out.println(k + " "+ v));

    }

    public static List<Address> getAddressByAge(List<Person> list, int age){

    return list
        .stream()
        .filter(f -> f.getAge()>age)
            .map(Person::getAddress)
        .collect(Collectors.toList());

    }

    public static List <String> getUniqName (List<String> name){
        return name
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static Map<Integer, List<Person>> getNameByAge (List <Person> list) {

        return list
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));
    }

    public static Map<String, List<BankAccount>> getBankAccountByName (List <BankAccount> bankAccountList){
        return bankAccountList.stream().collect(Collectors.groupingBy(s -> s.getOwner().getName()));
    }

}
