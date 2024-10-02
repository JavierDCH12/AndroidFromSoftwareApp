package com.example.fromsoftwareapp;

import android.content.Intent;
import android.os.Bundle;

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


    }//FIN ONCREATE



}//FIN MAIN