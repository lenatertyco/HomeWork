import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int [] input = {1, 10, 4, 8, 15};
        int [] moreThanX =getMoreThanX(input,5);
        for(int i:moreThanX){
            System.out.println(i);
        }
        List<Integer> asList = new ArrayList<>(Arrays.asList(1, 10, 4, 8, 15));
        //List<Integer> moreThanX2 = getMoreThanX(asList,5);
        List<Integer> moreThanX2 = getMoreThanXOld(asList,5);
        System.out.println(moreThanX2);

    }
    // {1, 10, 4, 8, 15}, n=5; =>{10, 8, 15}
public static int [] getMoreThanX(int [] input, int n){
        int [] output = new int [input.length];
        int count = 0;
        for (int i=0; i<input.length; i++){
            if (input[i]>n){
                output [count] = input [i];
                count++;
            }
        }
    //output.length = input.length;
    int [] realOutput = new int [count];
        for (int i =0; i<realOutput.length;i++){
            realOutput[i]=output [i];
        }
        return Arrays.copyOfRange(output, 0, count);
    }

    public static List<Integer> getMoreThanXOld(List<Integer> input, int n){
        List<Integer> output = new LinkedList<>();
        for(Integer elem:input){
            if(elem>n){
                output.add(elem);
                }
            }
return output;

    }
    public static List<Integer> getMoreThanX (List<Integer> input, int n){
        return input
                .stream()
                .filter(s -> s>n)
                .collect(Collectors.toList());
    }

}
