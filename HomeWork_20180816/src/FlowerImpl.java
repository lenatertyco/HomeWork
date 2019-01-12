public class FlowerImpl extends Plant {
    public FlowerImpl(String name, int height, int age) {
        super(name, height, age);
    }
    private static int FlowerGrowingValue = 5;

    @Override
    public int getGrowPerSeason() {
        return FlowerGrowingValue;
    }

    @Override
    public void doSummer() {
        System.out.printf("%s is not growing in Summer %d\n", getName(),getHeight());

    }

    @Override
    public void doAutumn() {
        setHeight(0);
        System.out.printf("%s is cut to zero in Autumn %d\n", getName(),getHeight());

    }

}
