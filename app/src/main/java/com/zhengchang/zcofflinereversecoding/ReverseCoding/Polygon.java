package com.zhengchang.zcofflinereversecoding.ReverseCoding;

import android.graphics.PointF;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by chenggang on 2/29/16.
 */
public class Polygon {

    private JSONArray points;
    public Polygon(JSONArray points) {

        this.points = points;
    }


    public boolean containsPoints(PointF point){

        int nvert = this.points.length();

        double testx = point.x;
        double testy = point.y;

        double vertx[] = new double[nvert];
        double verty[] = new double[nvert];

        for (int i = 0; i < nvert; i++) {

            JSONArray pointInfo;
            try {
                pointInfo = points.getJSONArray(i);
                double x = pointInfo.getDouble(0);
                double y = pointInfo.getDouble(1);
                vertx[i] = x;
                verty[i] = y;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

//        Log.e("polygon", ""+ nvert + " " + testx + " " + testy);

        int i = 0;
        int j = 0;
        boolean contains = false;
        for (i = 0, j = nvert-1; i < nvert; j = i++) {
            if ( ((verty[i]>testy) != (verty[j]>testy)) &&
                    (testx < (vertx[j]-vertx[i]) * (testy-verty[i]) / (verty[j]-verty[i]) + vertx[i]) )
                contains = !contains;
        }

        return contains;

    }

}
