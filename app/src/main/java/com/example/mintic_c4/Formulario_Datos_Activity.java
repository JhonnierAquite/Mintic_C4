package com.example.mintic_c4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Formulario_Datos_Activity extends AppCompatActivity {
    private ImageButton btn_Vmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_datos);

        btn_Vmenu = findViewById(R.id.btn_Vmenu);

        btn_Vmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Vmenu = new Intent(Formulario_Datos_Activity.this,Menu.class);
                startActivity(Vmenu);
            }
        });
    }
}