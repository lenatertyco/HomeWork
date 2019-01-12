import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) {
        Adresse ad1 = new Adresse ("Obststr.", 13);
        Person p1 = new Person ( "Andrew", 39, new Adresse("Peas", 2) );
        Person p2 = new Person ( "Andrew", 39, new Adresse("Okr", 45) );
        Person p3 = new Person ( "Andrew", 39, new Adresse("Freadom", 7) );

    }


   public static String serialize (Person p1){
       ObjectMapper mapper = new ObjectMapper;
   }
}
