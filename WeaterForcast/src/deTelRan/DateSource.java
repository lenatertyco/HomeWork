package deTelRan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Optional;

public class DateSource {

    private final String SEARCH_URL = "https://www.metaweather.com/api/location/search/";
    private final String QUERY_PARM = "query";
    private final String FORECAST_URL = "https://www.metaweather.com/api/location/";


    private URL searchUrl;

    public Optional<String> readSearchResults (String param) throws IOException{

        //https s SEARCH_URL i t.d + "?" kak v brousere
        //dolzhen vozvrawat object, no zdes reshenie zadachi predusmotrivaet vozvrawenie stroki, a object sozdatsja v main,
        // chtoby izbezhat izmenenija wsego metoda
        //pri izmenenie DataSource source, t.e. metod ne reshaet otkuda prihodjat dannye(iz kakogo servece)

        searchUrl = new URL (SEARCH_URL + "?" + QUERY_PARM + "="+param);

        URLConnection com = searchUrl.openConnection();
        return readFromInputStream(com.getInputStream());
    }

    public Optional<String> readSearch (String woeid) throws IOException{
        searchUrl = new URL(FORECAST_URL+woeid);

        URLConnection conn = searchUrl.openConnection();
        return getInputStream(searchUrl);
    }

    private  Optional<String> getInputStream(URL searchUrl)throws IOException{
        URLConnection conn = searchUrl.openConnection();
        return readFromInputStream((conn.getInputStream()));
    }

    private Optional<String> readFromInputStream(InputStream is){
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        return reader.lines().reduce((a, b) -> a+b);
    }


}
