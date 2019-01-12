import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java. util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

    String [] input = { "aaa", "bbbb", "a", "bb"};
    String [] output = sortString(input);
    for(String s:output) {
        System.out.println(s);
    }


    }

    public static String[] sortString (String [] s){
        Stream <String> streamOfStrings = Stream.of(s);
        List<String> collect = streamOfStrings.sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        return collect.toArray(new String[collect.size()]);

    }
}