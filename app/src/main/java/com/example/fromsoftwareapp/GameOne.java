package com.example.fromsoftwareapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fromsoftwareapp.databinding.ActivityGameOneBinding;

public class GameOne extends AppCompatActivity {

    ActivityGameOneBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityGameOneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String mensaje = intent.getStringExtra("mensaje");
        if (mensaje != null) {
            binding.TextGameOne.setText(mensaje); // Aquí asignas el mensaje al TextView
        }

    }//FIN ONCREATE


}//FIN MAIN