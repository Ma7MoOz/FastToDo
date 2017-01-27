package com.mahmoudmagdioffecial.fasttodo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

public class newTaskActivity extends AppCompatActivity {

    public newTaskActivity(){}

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.new_task);
    }
}
