package com.example.fromsoftwareapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import com.example.fromsoftwareapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //GAME ONE BOTTON IMAGE
        binding.BotonImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GameOne.class);
                intent.putExtra("mensaje", "juego 1");

                startActivity(intent);
            }
        });



        //GAME TWO BOTTON IMAGE
        binding.BotonImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GameTwo.class);
                intent.putExtra("mensaje", "juego 2");

                startActivity(intent);
            }
        });


        //GAME THREE BOTTON IMAGE
        binding.BotonImg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GameThree.class);
                intent.putExtra("mensaje", "juego 3");

                startActivity(intent);
            }
        });






    }//FIN ONCREATE





}//FIN MAIN