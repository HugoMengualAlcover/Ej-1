package com.example.ej_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView lblSaludo;
    private Button btnReset;
    private Button btnSaludo;
    private EditText txtName;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializeVistas();

        btnSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtName.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "No has introducido ningun nobre", Toast.LENGTH_SHORT).show();
                }else{
                    lblSaludo.setText("Hola " + txtName.getText() + ", buenos dias");
                    txtName.setText("");
                }
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblSaludo.setText("");
            }
        });
    }


    private void inicializeVistas() {
        lblSaludo = findViewById(R.id.lblsaludoMain);
        btnReset = findViewById(R.id.btnResetMain);
        btnSaludo = findViewById(R.id.btnSaludarMain);
        txtName = findViewById(R.id.txtNameMain);
    }
}