public class Main {


    public static void main(String[] args) {

        Person p = new Boy ("Roma",5);
        Boy b = (Boy) p;
        System.out.println(p instanceof Boy );

    }
}
