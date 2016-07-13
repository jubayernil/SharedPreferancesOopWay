package com.kim.mobileappdevelop.mysharedpreferencesoopway;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewDataDisplay;
    EditText editTextData;

    PreferenceData preferenceData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewDataDisplay = (TextView) findViewById(R.id.TextViewDataDilplay);
        editTextData = (EditText) findViewById(R.id.EditTextData);

        preferenceData = new PreferenceData(MainActivity.this);

    }

    public void saveData(View view) {
        String dataToBeSaved = editTextData.getText().toString();
        preferenceData.saveData(dataToBeSaved);
    }


    public void showData(View view) {
        String dataToBeShown = preferenceData.getData();
        textViewDataDisplay.setText(dataToBeShown);
    }

}
