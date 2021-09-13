package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.helloworld.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = ActivityMainBinding.inflate(getLayoutInflater());
       View view = binding.getRoot();
       setContentView(view);
    }

    public void onClick(View view) {

        ImageView imageView = findViewById(R.id.imageView);
        binding.imageView.setImageResource(R.drawable.hi);
        Toast.makeText(this,"이미지를 보여줍니다", Toast.LENGTH_LONG).show();

    }



}