package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MindentificateActivity extends AppCompatActivity {
    ImageButton btn_register;
    ImageButton btn_invitado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.identificate);

      btn_register = findViewById(R.id.btn_register);
      btn_invitado = findViewById(R.id.btn_invitado);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MindentificateActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btn_invitado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MindentificateActivity.this, Home_inviActivity.class);
                startActivity(intent);
            }
        });
    }
}