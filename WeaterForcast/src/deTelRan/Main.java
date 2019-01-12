package deTelRan;

public class Main {
    public static void main(String[] args) throws Exception {

        WeatherForcaster wh = new WeatherForcaster(new DateSource());

        //sozdanie new DateSource, tak.k metod iz "DateSource" vozvrawaet Strochky
        //Esli by v DateSource byli by objecty resourca, to pri izmenen servera, otkuda poluchajutsha dannue
        //dolzhen pomenjatsja metod ili chtobu etogo izbezhat nuzhno s "DateSource" sozdavat Interface
        //togda vmesto new DateSource budut raznye realizacii Interface

        SearchResult berlin = wh.findLocationByCityName("berlin");
        System.out.println(berlin);


        Forecast weatherByWoeid = wh.getWeatherByWoeid (berlin.getWoeid());
        System.out.println(weatherByWoeid);
        System.out.println("Weather in Berlin "+ weatherByWoeid.getConsolidateWeather()[0].getTheTemp());
    }


}
