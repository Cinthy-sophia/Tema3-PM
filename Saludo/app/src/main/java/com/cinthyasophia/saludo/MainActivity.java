package com.cinthyasophia.saludo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvTitulo;
    private Button bSaluda;
    private EditText etNombre;
    private EditText etApellidos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitulo= findViewById(R.id.tvTitulo);
        bSaluda= findViewById(R.id.bSaluda);
        etNombre= findViewById(R.id.etNombre);
        etApellidos= findViewById(R.id.etApellidos);
        bSaluda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hola " + etNombre.getText() + " " + etApellidos.getText(), Toast.LENGTH_LONG).show();
            }


        });

    }

}
