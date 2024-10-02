package com.example.fromsoftwareapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fromsoftwareapp.databinding.ActivityGameThreeBinding;
import com.example.fromsoftwareapp.databinding.ActivityGameTwoBinding;

public class GameThree extends AppCompatActivity {
    ActivityGameThreeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityGameThreeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        Intent intent = getIntent();

        //MENU BACK BUTTON
        binding.ButtonBackThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GameThree.this, MainActivity.class);

                startActivity(intent);
            }
        });


    }//FIN ONCREATE



}//FIN MAIN