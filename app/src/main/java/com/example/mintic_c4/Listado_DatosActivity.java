package com.example.mintic_c4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Listado_DatosActivity extends AppCompatActivity {

    private ImageButton btn_Vmenu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_datos);

        btn_Vmenu1 = findViewById(R.id.btn_Vmenu1);


        btn_Vmenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Vmenu1 = new Intent(Listado_DatosActivity.this,Menu.class);
                startActivity(Vmenu1);
            }
        });
    }
}