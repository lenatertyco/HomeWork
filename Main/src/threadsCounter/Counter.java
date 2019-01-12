package threadsCounter;

public class Counter extends Thread{
    private static long count1 =0;
    private static long count2 =0;
    private static Object monitor = new Object();
    private int nRuns;

    public static long getCount1() {
        return count1;
    }

    public static long getCount2() {
        return count2;
    }

    public Counter (int nRuns){
        super ();
        this.nRuns = nRuns;
    }
    @Override

    public  void run (){
        for (int i = 0; i < nRuns; i++){
            putCount1(1);
            putCoun2(2);
        }
    }
    synchronized private static void putCount1(int number){
        count1 += number;
    }
    private static void putCoun2(int number) {
        synchronized (monitor) {

            count2 += number;
        }
    }

}
