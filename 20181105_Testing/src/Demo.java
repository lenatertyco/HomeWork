import com.sun.media.sound.InvalidDataException;

public class Demo {


    //input.length()==3 -> input.toUpperCase()
    //input.length()==4 -> input.toLowerCase()
    public static String checkString (String input)throws IncorrectInputDataException{

        if (input != null){

            if (input.length()==3){
                return input.toUpperCase();
            }
            if (input.length()==4){
                return  input.toLowerCase();
            }
            return input;
        }else {
                throw new IncorrectInputDataException("input is null");
                }
        }
}