package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Recap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.recap);

        TextView interfaceRecap = findViewById(R.id.InterfaceRecap);

        String prenom = getIntent().getStringExtra("Prenom");
        String nom = getIntent().getStringExtra("Nom");
        String email = getIntent().getStringExtra("Email");
        String adresse = getIntent().getStringExtra("Adresse");
        String phone = getIntent().getStringExtra("Phone");

        // Ensure values are not null to avoid concatenation issues
        prenom = (prenom != null) ? prenom : "";
        nom = (nom != null) ? nom : "";
        email = (email != null) ? email : "N/A";
        adresse = (adresse != null) ? adresse : "N/A";
        phone = (phone != null) ? phone : "N/A";

        String info = String.format(
                "Informations de l'utilisateur :\n\nNom : %s %s\nAdresse : %s\nEmail : %s\nTéléphone : %s",
                prenom, nom, adresse, email, phone
        );

        interfaceRecap.setText(info);
    }
}
