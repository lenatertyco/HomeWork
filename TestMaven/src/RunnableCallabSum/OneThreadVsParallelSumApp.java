package RunnableCallabSum;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class OneThreadVsParallelSumApp {
    private static final int N_LIST = 5000;
    private static final long N_NUMBERS = 1000;
    private static final int N_THREADS = 1000;

    public static void main(String[] args) {
        List<List<Integer>> listNumbers = getRandomNumbers ();
        getSum(listNumbers);
        getParallelSumRunnable (listNumbers);
        getParallelSumCallable(listNumbers);
    }


    private static void getParallelSumCallable(List <List<Integer>> listNumbers) throws InterruptedException {
        Instant start = Instant.now();
        ExecutorService pool = Executors.newFixedThreadPool(N_THREADS);
        ArrayList <Callable<ListSumCallab>> listCallable = new ArrayList<>(N_THREADS);
        int index = 0;
        for (List <Integer> list :listNumbers){
            listCallable.add(new ListSumCallab(list));
            index++;
        }
        List<Future<ListSumCallab>> futureList = pool.invokeAll(listCallable);
        int sum = futureList.stream()
                .mapToInt(i-> {
                    try {
                        return i.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                })
                .sum();
        pool.shutdown();
        System.out.println("get ParallelSumCallable: " + ChronoUnit.MILLIS.between((start, Instant.now()));

    }

    private static  void getParallelSumRunnable (List<List<Integer>> listNumbers) throws InterruptedException {
        Instant start = Instant.now();
        ListSumRunnable [] listRunnable = new ListSumRunnable[N_THREADS];
        ExecutorService pool = Executors.newFixedThreadPool(N_THREADS);
        int index =0;
        for (List<Integer> list : listNumbers){
            listRunnable [index] = new ListSumRunnable(list);
            pool.submit(listRunnable[index]);
            index++;
        }
        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.SECONDS);
        int sum = Arrays.stream (listRunnable)
                .mapToInt(ListSumRunnable::getSum)
                .sum();
        System.out.println("get sum " + ChronoUnit.MILLIS.between((start, Instant.now()));
    }


    private static void getSum (List<List<Integer>> listNumbers){
        Instant start = Instant.now();
        int sum = listNumbers.stream()
                .flatMap(List::stream)
                .mapToInt(i ->i)
                .sum();
        System.out.println("get sum "+ ChronoUnit.MILLIS.between((start, Instant.now()));
    }

     private static List<List<Integer>> getRandomNumbers (){
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < N_LIST; i++){
            List<Integer> list = getRandomList ();
            res.add(list);
        }
        return  res;
    }
    private static List<Integer> getRandomList(){
        return new Random().ints(N_NUMBERS).boxed().collect(Collectors.toList());
    }
}
