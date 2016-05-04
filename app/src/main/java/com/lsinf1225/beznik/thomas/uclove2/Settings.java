package com.lsinf1225.beznik.thomas.uclove2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;


public class Settings extends AppCompatActivity
{

    Button mEnter;
    Button mFr;
    Button mEng;
    EditText mOld;
    EditText mNew;
    String New;
    String Old;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        mEnter = (Button) findViewById(R.id.psw_enter);
        mFr = (Button) findViewById(R.id.btn_fr);
        mEng = (Button) findViewById(R.id.btn_en);
        mOld = (EditText) findViewById(R.id.psw_old);
        mNew = (EditText) findViewById(R.id.psw_new);

        mFr.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                     /*   String languageToLoad = "fr"; // your language
                        Locale locale = new Locale(languageToLoad);
                        Locale.setDefault(locale);
                        Configuration config = new Configuration();
                        config.locale = locale;
                        getBaseContext().getResources().updateConfiguration(config,
                                getBaseContext().getResources().getDisplayMetrics());
                        setContentView(R.layout.activity_settings);*/

                        Locale loc = Locale.FRENCH;
                        Configuration config = new Configuration();
                        config.locale = loc;
                        Locale.setDefault(loc);
                        getBaseContext().getResources().updateConfiguration(config, getResources().getDisplayMetrics());
                        finish();
                        startActivity(new Intent(Settings.this, Settings.class));
                    }
                });

        mEng.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        /*String languageToLoad = "en"; // your language
                        Locale locale = new Locale(languageToLoad);
                        Locale.setDefault(locale);
                        Configuration config = new Configuration();
                        config.locale = locale;
                        getBaseContext().getResources().updateConfiguration(config,
                                getBaseContext().getResources().getDisplayMetrics());
                        setContentView(R.layout.activity_settings);*/

                        Locale loc = Locale.ENGLISH;
                        Configuration config = new Configuration();
                        config.locale = loc;
                        Locale.setDefault(loc);
                        getBaseContext().getResources().updateConfiguration(config, getResources().getDisplayMetrics());
                        finish();
                        startActivity(new Intent(Settings.this, Settings.class));

                    }
                });

        mEnter.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        Old = mOld.getText().toString();

                        if (Old.equals("abc"))//Verifier le psw
                        {
                            New = mNew.getText().toString();
                            //Change psw
                            Toast.makeText(getApplicationContext(), getString(R.string.psw_right), Toast.LENGTH_SHORT).show();

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), getString(R.string.psw_wrong), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

}