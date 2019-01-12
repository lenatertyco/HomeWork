public class TreeImpl extends Plant {
    public TreeImpl(String name, int height, int age) {
        super(name, height, age);
    }
    private static int TreeGrowingValue = 3;

    @Override
    public int getGrowPerSeason() {
        return TreeGrowingValue;
    }

    @Override
    public void doSummer() {
        setHeight(getHeight()+ getGrowPerSeason());
        System.out.printf("%s has grown in Summer %d\n", getName(),getHeight());

    }

    @Override
    public void doAutumn() {
        System.out.printf("%s is not growing in Autumn %d\n", getName(),getHeight());

    }
}
