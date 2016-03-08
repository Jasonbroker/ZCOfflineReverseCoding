package com.zhengchang.zcofflinereversecoding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zhengchang.zcofflinereversecoding.ReverseCoding.OffLineReverseCoding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText longitude = (EditText) findViewById(R.id.longitude);
        longitude.setText("116.3");

        EditText latitude = (EditText) findViewById(R.id.latitude);
        latitude.setText("39.9");

        Button button = (Button) findViewById(R.id.search_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText longitudeText = (EditText) findViewById(R.id.longitude);
                EditText latitudeText = (EditText) findViewById(R.id.latitude);

                float longitude = Float.parseFloat(longitudeText.getText().toString());
                float latitude = Float.parseFloat(latitudeText.getText().toString());
               Object obj = OffLineReverseCoding.quaryLocationInfoOffline(latitude, longitude, getApplicationContext());
                try {
                    ((TextView)findViewById(R.id.result)).setText(obj.toString());
                } catch (Exception ex){
                    Toast.makeText(getApplicationContext(), "cant find info!", Toast.LENGTH_LONG).show();
                }

            }
        });

    }


}
