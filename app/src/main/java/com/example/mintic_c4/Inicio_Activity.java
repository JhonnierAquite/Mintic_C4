package com.example.mintic_c4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Inicio_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_inicio);
        //Animacion logo//
        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.despla_arriba);

        ImageView Logo_inicio = findViewById(R.id.Logo_inicio);


        Logo_inicio.setAnimation(animation1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login = new Intent(Inicio_Activity.this, Login_Activity.class);
                startActivity(login);
                finish();
            }
        },5000);


    }
}