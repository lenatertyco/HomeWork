import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //List<Printer> printers = new ArrayList<>();


            System.out.println("Enter string: ");
            String symbols = scanner.nextLine();
            System.out.println("Enter timout: ");
            int interval = Integer.parseInt(scanner.nextLine())*1000;
            Printer printer = new Printer(symbols, interval);
            printer.start();
        System.out.println("Enter 'q' for quit, enter 'c' for change current symbol");
        String line;
        while (true){
            line = scanner.nextLine();
            if (line.toLowerCase().equals("q")){
                break;
            }
            if (line.toLowerCase().equals("c")){
                printer.interrupt();
            }
        }
        scanner.close();
        System.out.println("Finished");

    }
}
