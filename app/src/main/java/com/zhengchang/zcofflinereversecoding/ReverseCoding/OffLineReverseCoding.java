package com.zhengchang.zcofflinereversecoding.ReverseCoding;

import android.content.Context;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by chenggang on 3/8/16.
 */
public class OffLineReverseCoding {

    public  static City quaryCityOffline(float latitude, float longitude, Context context){
        String json = getFromAssets("china.json", context);
//            ​​String json = new String(buffer);
        GeoJsonParser parser = new GeoJsonParser(json);
        return parser.geoCodeCityWithCoordinate(latitude, longitude);
    }

    public  static Country quaryCountryOffline(float latitude, float longitude, Context context){
        String json = getFromAssets("countries.json", context);

        GeoJsonParser parser = new GeoJsonParser(json);
        return parser.geoCodeCountryWithCoordinate(latitude, longitude);
    }

    public static String getFromAssets(String fileName, Context context){
        try {
            InputStreamReader inputReader = new InputStreamReader( context.getResources().getAssets().open(fileName) );
            BufferedReader bufReader = new BufferedReader(inputReader);
            String line="";
            String Result="";
            while((line = bufReader.readLine()) != null)
                Result += line;
            return Result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object quaryLocationInfoOffline(float latitude, float longitude, Context context){

        boolean inChina = GeoJsonParser.checkIfInChina(latitude,longitude);

        if (inChina){
            return quaryCityOffline(latitude,longitude,context);
        }else {
            return quaryCountryOffline(latitude,longitude, context);
        }

    }

}
