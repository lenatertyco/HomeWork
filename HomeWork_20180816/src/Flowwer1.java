public class Flowwer1 extends Plant{

    public Flowwer1 (String name, int height, int age){
        super (name, height, age);
    }


    @Override
    public int getGrowPerSeason() {
        return 0;
    }

    @Override
    public void doSummer() {

    }

    @Override
    public void doAutumn() {

    }
}
