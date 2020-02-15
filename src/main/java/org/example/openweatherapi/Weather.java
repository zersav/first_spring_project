package org.example.openweatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    @JsonProperty("temp")
    private Double temp;

    @JsonProperty("feels_like")
    private Double feelsLike;

    @JsonProperty("pressure")
    private Integer pressure;

    @JsonProperty("humidity")
    private Integer humidity;

    public Double getFeelsLike() {
        return feelsLike;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public Double getTemp() {
        return temp;
    }

    public Integer getPressure() {
        return pressure;
    }
}