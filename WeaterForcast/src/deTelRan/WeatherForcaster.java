package deTelRan;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.IOException;
import java.util.Optional;

public class WeatherForcaster {

    ObjectMapper mapper = new ObjectMapper();


    DateSource source;

    public WeatherForcaster (DateSource source) {
        this.source = source;
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }

    public Optional<SearchResult> findLocationByCityName(String city) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Optional<String> searchResulString = source.readSearchResults(city);

        SearchResult[] searchResults = mapper.readValue(searchResulString.get(), SearchResult[].class);
        if (searchResults.length==0){
            return Optional.empty();
        }
        return Optional.of(searchResults[0]);
    }

    public Forecast getWeatherByWoeid(String woeid) throws IOException {
        //class iz postmann


        Optional<String> forecastString = source.readSearch(woeid);
        Forecast forecast = mapper.readValue (forecastString.get(), Forecast.class);
        return forecast;

    }


}