package org.example.openweatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeather {

    @JsonProperty("name")
    private String name;
    @JsonProperty("main")
    public Weather weather;
    @JsonProperty("wind")
    public Wind wind;


    public String getName() {
        return name;
    }

    public Double getFeelsLikeTemp() {
        return weather.getFeelsLike();
    }

    public Integer getHumidity() {
        return weather.getHumidity();
    }

    public Double getTemp() {
        return weather.getTemp();
    }

    public Integer getPressure() {
        return weather.getPressure();
    }

    public Double getSpeed() {
        return wind.getSpeed();
    }

    //пізніше створити файл *.properties та винести в нього дані
    private static String url = "https://openweathermap.org/data/2.5/weather?id=";
    private static String api_key = "&appid=b6907d289e10d714a6e88b30761fae22";

    public static OpenWeather getWeather(String sity_id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url + sity_id + api_key, OpenWeather.class);
    }
}
