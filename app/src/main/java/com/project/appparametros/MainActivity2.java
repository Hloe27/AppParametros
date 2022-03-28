package com.project.appparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        tv2=findViewById(R.id.tv2);
        String dato = getIntent().getStringExtra("dato");

        tv2.setText("Hola " + dato);

    }
    //metodo boton regresar

    public  void  regresar(View view){
        Intent i=new Intent(this, MainActivity.class);
            startActivity(i);
    }

}