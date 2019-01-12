package de.telrana;

import deTelRan.DateSource;
import deTelRan.SearchResult;
import deTelRan.WeatherForcaster;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class WeatherForecasterTest {

    WeatherForcaster forecaster;

    DateSource s = Mockito.mock (DateSource.class);
    // == new object classa

    @Before
    public void setUp () throws  Exception{
        forecaster = new WeatherForcaster(s);
        // new WeatherFo.. sozdan cherez mock "s"-->faike znachenie
    }

    @Test

    public  void testFindLocationByCityName () throws Exception{

        when (s.readSearchResults("Paris")).thenReturn(Optional.of(SEARCH_RESULTS));
        // cheres "When" nastrojka povedenija
        Optional<SearchResult> result = forecaster.findLocationByCityName("Paris");
        assertTrue (result.isPresent());
        assertEquals("woeid", "615702", result.get().getWoeid());


    }

    private static final String SEARCH_RESULTS = "[{\"title\": \"Paris\",\"location_type\": \"City\",\"woeid\": 615702,\"latt_long\": \"48.856930,2.341200\"}]";
    //zadaetsja gotovuj rezultat dlja resultata, kotoryj ispolzujutsja pri teste dlja MOCK
}

