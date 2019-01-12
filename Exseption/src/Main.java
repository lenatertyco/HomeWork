import java.io.*;

public class Main {

    public static void main(String[] args)  throws FileNotFoundException {

        try (InputStream is = new FileInputStream("numbers.txt");
             OutputStream os = new FileOutputStream( "C:\\Users\\lenat\\IdeaProjects\\Exseption\\text2.txt")){
            byte[] buffer = new byte [128];
            int read = 0;

            while ((read= is.read(buffer)) != -1) {
                System.out.println("Read bytes "+ read);
                //System.out.print((char) c);
                //print, ne println, chtobu ne pereskakivat na druguju stroku
                os.write(buffer, 0, read);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}


