package threadsCounter;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class CounterApp {
    private static final int N_COUNTERS = 1000;
    private static final int N_RUNS= 10000;

    public static void main(String[] args) throws InterruptedException {
        Counter [] counters = new Counter [N_COUNTERS];
        Instant start =Instant.now();
        for (int i = 0; i< counters.length; i++){
            counters [i]=  new Counter(N_RUNS);
            counters[i].start();
        }
        for (int i =0; i< counters.length; i++){
            counters[i].join();
        }
        Instant finish = Instant.now();
        System.out.println(String.format("Counter1 = %d, couner2 =%d", Counter.getCount1(), Counter.getCount2()));
        System.out.println(String.format("Running in millis = %d", ChronoUnit.MILLIS.between(start, finish)));
    }
}
