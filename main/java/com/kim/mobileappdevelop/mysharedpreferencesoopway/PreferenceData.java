package com.kim.mobileappdevelop.mysharedpreferencesoopway;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Mobile App Develop on 13-7-16.
 */
public class PreferenceData {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Context context;
    static final String NAME_KEY = "message";

    public PreferenceData(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("SavedData", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveData(String data){
        editor.putString(NAME_KEY, data);
        editor.commit();
    }

    public String getData(){
        String dataToBeShown = sharedPreferences.getString(NAME_KEY, "No Data Found");
        return dataToBeShown;
    }
}
