import sun.util.resources.LocaleData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        List<LocalDateTime> d1 = new ArrayList<LocalDateTime>();

        d1.add(LocalDateTime.parse("01-02-2017 02:04", formatter));
        d1.add(LocalDateTime.parse("03-03-2013 10:43", formatter));
        d1.add(LocalDateTime.parse("22-04-2018 11:30", formatter));

        System.out.println(daysBetween(d1));

    }

    public static  long daysBetween (List<LocalDateTime> input){
            List<LocalDateTime> localDate = input.stream()
                    .sorted()
                    .collect(Collectors.toList());
            return ChronoUnit.DAYS.between(localDate.get(0),localDate.get(localDate.size() -1));


    }

}
