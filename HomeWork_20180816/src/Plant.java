public abstract class Plant {

   private String name;
   private int height;
   private int age;

    public Plant (String name, int height, int age){

        this.age = age;
        this.height = height;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addYearToAge (){
        this.age++;
    }
    public abstract int getGrowPerSeason ();

    public void doSpring (){
        addYearToAge();
        setHeight(getHeight() + getGrowPerSeason());
        System.out.printf("%s has grow in Spring %d\n",getName(),getHeight() );
    }
    public abstract void doSummer ();
    public abstract void doAutumn ();
    public void doWinter (){
        System.out.printf("%s is not growing in winter %d\n", getName(), getHeight());
    }
}
