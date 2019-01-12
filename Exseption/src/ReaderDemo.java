import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

public class ReaderDemo {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("numbers.txt"))) {

            Optional<Integer> reduce =br.lines().map(s -> Integer.parseInt(s)).reduce((a, b) -> a+b);
            System.out.println(reduce.orElse(-1));
            //String s;
            //while ((s = br.readLine() != null)) {

            }catch(IOException ex){
                ex.printStackTrace();
            }

        }
    }

