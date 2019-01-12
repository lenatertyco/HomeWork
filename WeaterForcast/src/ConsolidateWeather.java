public class ConsolidateWeather {

    private double theTemp;

    public ConsolidateWeather (){

    }

    public double getTheTemp() {
        return theTemp;
    }

    public void setTheTemp(double theTemp) {
        this.theTemp = theTemp;
    }

    @Override
    public String toString() {
        return "ConsolidateWeather" + "theTemp=" + theTemp;
    }
}
