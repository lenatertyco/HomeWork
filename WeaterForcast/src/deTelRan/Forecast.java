package deTelRan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
@JsonIgnoreProperties (ignoreUnknown = true)

public class Forecast {

    private ConsolidateWeather[] consolidateWeather;
    public Forecast (){

    }

    public ConsolidateWeather[] getConsolidateWeather() {
        return consolidateWeather;
    }

    public void setConsolidateWeather(ConsolidateWeather[] consolidateWeather) {
        this.consolidateWeather = consolidateWeather;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "consolidateWeather=" + Arrays.toString(consolidateWeather) +
                '}';
    }
}
