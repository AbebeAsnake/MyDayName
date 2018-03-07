package me.abebe.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Horoscope {
    private String date;
    private String horoscope;
    private String sunsign;
    private Value value;

    public Horoscope() {
       // this.date= "08-03-2018";
    }


    @Override
    public String toString() {
        return "Value{" +
                ", date=" + date +
                ", horoscope='" + horoscope + '\'' +
                ", sunsign='" + sunsign + '\'' +
                '}';
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }

    public String getSunsign() {
        return sunsign;
    }

    public void setSunsign(String sunsign) {
        this.sunsign = sunsign;
    }
}
