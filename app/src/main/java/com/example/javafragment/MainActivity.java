package com.example.javafragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void goToFirst(View view){
            // FragmentManager Fragmentler ile calismak icin bizim onemli bir sinifimiz!!!
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FirstFragment firstFragment = new FirstFragment();

        //fragmentTransaction.add(R.id.frame_layout, firstFragment).commit(); // hangi frame layout icerisinde kullanican ve hangi fragmenti kullanican onu yaziyorsun !!
        //add dersen eger uzerine yazar!! Bu nedenle replace kullanabiliriz !!
        fragmentTransaction.replace(R.id.frame_layout, firstFragment).commit();




    }

    public void goToSecond(View view){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SecondFragment secondFragment = new SecondFragment();

        fragmentTransaction.replace(R.id.frame_layout,secondFragment).commit();


    }
}