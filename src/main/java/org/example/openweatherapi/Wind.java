package org.example.openweatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind {

    @JsonProperty("speed")
    public Double speed;

    @JsonProperty("deg")
    public Integer deg;

    public Double getSpeed() {
        return speed;
    }

    public Integer getDeg() {
        return deg;
    }
}