package com.example.mintic_c4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Simulacion_Mapa_Activity extends AppCompatActivity {

    private ImageButton btn_Vmenu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulacion_mapa);

        btn_Vmenu2 = findViewById(R.id.btn_Vmenu2);

        btn_Vmenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Vmenu2 = new Intent(Simulacion_Mapa_Activity.this,Menu.class);
                startActivity(Vmenu2);
            }
        });
    }
}