package com.example.mintic_c4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

   private ImageButton btn_mapa;
   private ImageButton btn_tienda;
   private ImageButton btn_formulario_datos;
    private ImageButton btn_cerrar_sesion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_mapa = findViewById(R.id.btn_mapa);
        btn_tienda = findViewById(R.id.btn_tienda);
        btn_formulario_datos = findViewById(R.id.btn_formulario_datos);
        btn_cerrar_sesion = findViewById(R.id.btn_cerrar_sesion);


        btn_mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ac_simulacion_mapa = new Intent(Menu.this,Simulacion_Mapa_Activity.class);
                startActivity(Ac_simulacion_mapa);
            }
        });

        btn_tienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listado_datos = new Intent(Menu.this,Listado_DatosActivity.class);
                startActivity(listado_datos);
            }
        });

        btn_formulario_datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formulario_datos = new Intent(Menu.this,Formulario_Datos_Activity.class);
                startActivity(formulario_datos);
            }
        });

        btn_cerrar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // FirebaseAuth.getInstance().signOut(); para desconertar firebase
                Toast.makeText(Menu.this, "Sesión Finalizada", Toast.LENGTH_SHORT).show();
                cerrar_sesion();
            }
        });
    }

    private void cerrar_sesion() {
        Intent i = new Intent(this,Login_Activity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
        finish();
    }
}