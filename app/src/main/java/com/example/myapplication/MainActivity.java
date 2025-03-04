package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        EditText ednom = findViewById(R.id.nom);
        EditText edprenom = findViewById(R.id.prenom);
        EditText edemail = findViewById(R.id.email);
        EditText edphone = findViewById(R.id.phone);
        EditText edadresse = findViewById(R.id.adresse);
        Button Envoyer = findViewById(R.id.envoyer);

        Envoyer.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this , Recap.class);
            intent.putExtra("Nom" , ednom.getText().toString());
            intent.putExtra("Prenom" , edprenom.getText().toString());
            intent.putExtra("Adresse" , edadresse.getText().toString());
            intent.putExtra("Email" , edemail.getText().toString());
            intent.putExtra("Phone" , edphone.getText().toString());


            startActivity(intent);

        });


    }


}