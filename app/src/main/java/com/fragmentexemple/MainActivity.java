package com.fragmentexemple;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.fragmentexemple.fragments.*;

public class MainActivity extends AppCompatActivity {

    Button B1, B2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = (Button) findViewById(R.id.button1);
        B2 = (Button) findViewById(R.id.button2);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_switch, new HomeFragment()).commit();

            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_switch, new LoginFragment()).commit();
            }
        });
    }
}