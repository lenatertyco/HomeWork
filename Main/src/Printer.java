public class Printer extends  Thread{
    private String symbols;
    private long interval;

    public Printer(String symbols, long interval) {
        super();
        this.symbols = symbols;
        this.interval = interval;
        setDaemon(true);
    }
    @Override
    public void run(){
        int current = 0;
        while (true){
            System.out.print(symbols.charAt(current));
            try {
                sleep(interval);
            } catch (InterruptedException e) {
                current++;
                if(current == symbols.length()){
                    current=0;
                }
            }

        }
    }

}
