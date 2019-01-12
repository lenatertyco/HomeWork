import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your String");
        String str = scan.nextLine();
        scan.close();
        reverseString(str);
    }


    private static void reverseString (String inputString){
        String reverseString = "";
        int num = inputString.length()-1;
        for (int i=0; i<inputString.length(); i++){
            reverseString = reverseString+inputString.charAt(num);
            num--;
        }
        System.out.println(inputString);
        System.out.println(reverseString);
    }
}
