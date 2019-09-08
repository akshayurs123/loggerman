package com.lib.loggerman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lib.loggerlib.LoggerMan;

public class MainActivity extends AppCompatActivity {

    LoggerMan loggerMan = new LoggerMan();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loggerMan.recordLoggerMan("grass", "weed");

    }
}
