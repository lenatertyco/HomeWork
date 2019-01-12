import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate plusDays = localDate.plusDays(2);
        System.out.println(plusDays);

        LocalDateTime parse = LocalDateTime
                .parse("2018-02-20 10:15:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(parse);



        DayOfWeek dayOfWeek = LocalDate.parse("2018-02-20").getDayOfWeek();

        System.out.println(dayOfWeek);
        Set<String> avilableZoneId = ZoneId.getAvailableZoneIds();
        Iterator<String> iterator = avilableZoneId.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        LocalDateTime now = LocalDateTime.now();
        ZoneId irkutsk = ZoneId.of("Asia/Irkutsk");
        ZonedDateTime inIrkutsk = ZonedDateTime.of(now, irkutsk);
        System.out.println(inIrkutsk);

        LocalDateTime plusDays2 = now.plusDays(10);
        long between = ChronoUnit.DAYS.between(now, plusDays2);
        System.out.println(between);


    }
}
