package org.example.entity;

import org.example.openweatherapi.OpenWeather;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Meteo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Double temp;
    private Double feelsLike;
    private Integer pressure;
    private Integer humidity;
    private Double speed_wind;
    private String sity_name;

    public Integer getId() {
        return id;
    }

    public Meteo() {
    }

    public Meteo(OpenWeather ow) {
        this.temp = ow.getTemp();
        this.feelsLike = ow.getFeelsLikeTemp();
        this.humidity = ow.getHumidity();
        this.pressure = ow.getPressure();
        this.sity_name = ow.getName();
        this.speed_wind = ow.getSpeed();
    }


    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getSpeed_wind() {
        return speed_wind;
    }

    public void setSpeed_wind(Double speed_wind) {
        this.speed_wind = speed_wind;
    }

    public String getSity_name() {
        return sity_name;
    }

    public void setSity_name(String sity_name) {
        this.sity_name = sity_name;
    }

}
