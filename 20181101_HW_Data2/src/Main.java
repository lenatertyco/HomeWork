

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws ParseException {

        List<String> date = new ArrayList<>();
        date.add("03 Jun 2018");
        date.add("05 Jul 2018");
        date.add("10 Aug 2018");


        System.out.println(dataFormated(date));


        //LocalDateTime parse = LocalDateTime
                        //.parse("3 Jun 2018", DateTimeFormatter.ofPattern("EEEE", new ()))
        //System.out.println(parse);

    }


    public static List<String> dataFormated (List<String> input){
        List<String> collect = input
                .stream()
                .map(s -> createDateTimeFromString(s))
                .sorted()
                .map(d -> createStringFromDateTime(d))
                .collect(Collectors.toList());


        return collect;
    }

    public static LocalDate createDateTimeFromString(String dateString) {
        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd MMM yyyy"));
    }

    public static String createStringFromDateTime(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy", new Locale("en")));

    }
}
