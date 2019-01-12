package RunnableCallabSum;

import java.util.List;
import java.util.concurrent.Callable;

public class ListSumCallab implements Callable {

    List<Integer> numbers;

    public ListSumCallab(List<Integer> numbers) {
        super();
        this.numbers = numbers;
    }

    @Override
    public Object call ()throws Exception{
        return numbers.stream().mapToInt(i->i).sum();
    }
}
