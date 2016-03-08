package com.zhengchang.zcofflinereversecoding.ReverseCoding;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by chenggang on 3/1/16.
 */
public class City {

    private String cityName;
    private String cityCode;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    private Country country;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public City(JSONObject geoCountry) {

        try {
            this.cityCode = geoCountry.getString("id");
            this.cityName = geoCountry.getJSONObject("properties").getString("name");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "city:" + this.cityName;
    }
}
