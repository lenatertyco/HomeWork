package RunnableCallabSum;

import java.util.List;

public class ListSumRunnable implements Runnable {
    private List<Integer> numbers;
    private int sum;

    public ListSumRunnable(List<Integer> numbers, int sum) {
        this.numbers = numbers;
        this.sum = sum;
    }

    public ListSumRunnable() {

    }

    @Override
    public void run (){
        sum = numbers.stream().mapToInt(i ->i).sum();
    }

    public int getSum() {
        return sum;
    }
}
