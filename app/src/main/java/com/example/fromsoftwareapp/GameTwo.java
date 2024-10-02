package com.example.fromsoftwareapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fromsoftwareapp.databinding.ActivityGameTwoBinding;

public class GameTwo extends AppCompatActivity {

    ActivityGameTwoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding=ActivityGameTwoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        Intent intent = getIntent();

        //MENU BACK BUTTON
        binding.ButtonBackTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GameTwo.this, MainActivity.class);

                startActivity(intent);
            }
        });






    }//FIN ONCREATE





}//FIN MAIN