package com.zhengchang.zcofflinereversecoding.ReverseCoding;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by chenggang on 2/29/16.
 */
public class Country {
    public static int ContinentAsia = 0;
    public static int ContinentEurope = 1;
    public static int ContinentAfrica = 2;
    public static int ContinentSouthAmerica = 3;
    public static int ContinentNorthAmerica = 4;
    public static int ContinentAntetica = 5;
    public static int ContinentPacific = 6;

    private int contient;
    private String countryCode;
    private String countryName;
    private String localizedName;

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public int getContient() {
        return contient;
    }

    public void setContient(int contient) {
        this.contient = contient;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Country(){}

    public Country(JSONObject geoCountry) {
        try {
            this.countryCode = geoCountry.getString("id");
            this.countryName = geoCountry.getJSONObject("properties").getString("name");
            this.localizedName = geoCountry.getJSONObject("properties").getString("localizedName");
            String[][] continentsCountries = {Constants.asiaCountries,Constants.europeCountries, Constants.africaCountries, Constants.southAmericaCountries, Constants.northAmericaCountries,Constants.antarcticaCountries,Constants.pacificCountries};
            int index = 0;
            boolean hit = false;
            for (String[] continentCountries : continentsCountries){
                if (hit) break;
                for (String country : continentCountries ){
                 if (country.equals(this.getLocalizedName())){
                     this.contient = index;
                     hit = true;
                     break;
                 }
                }
                index++;

            }


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "country:" + this.countryName;
    }
}
