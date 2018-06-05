package com.example.charles.workingplace.Vue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.charles.workingplace.Controleur.Controleur;
import com.example.charles.workingplace.Modele.Etudiant;
import com.example.charles.workingplace.R;

public class Information extends AppCompatActivity {

    private Controleur controleur = new Controleur();

    private TextView infoPrenom;
    private TextView infoNom;
    private TextView infoAge;
    private TextView infoEmail;
    private TextView infoLieu;
    private Button modifierMdp;
    private TextView infoLieuReserve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        infoPrenom = (TextView) findViewById(R.id.infoPrenom);
        infoNom= (TextView) findViewById(R.id.infoNom);
        infoAge = (TextView) findViewById(R.id.infoAge);
        infoEmail = (TextView) findViewById(R.id.infoEmail);
        infoLieu = (TextView) findViewById(R.id.infoLieu);
        modifierMdp = (Button) findViewById(R.id.modifierMdp);
        infoLieuReserve = (TextView) findViewById(R.id.InfoLieuReserver);


        infoPrenom.setText(controleur.getUtilisateurCourant().recupererPrenom());
        infoNom.setText(controleur.getUtilisateurCourant().recupererNom());
        infoAge.setText(Integer.toString(controleur.getUtilisateurCourant().recupererAge()));
        infoEmail.setText(controleur.getUtilisateurCourant().getEmail());
        if(controleur.getUtilisateurCourant() instanceof Etudiant){
            infoLieuReserve.setText("Dernier lieu réservé");
        }

        else{
            infoLieuReserve.setText("Lieux ajouté(s)");
        }

        if(controleur.getUtilisateurCourant().getListeLieux().size() > 0){

            infoLieu.setText("•" +
                    controleur.getUtilisateurCourant().getListeLieux().get(controleur.getUtilisateurCourant().getListeLieux().size()-1).getAdresse()

            );

            }

        else{

            infoLieu.setText("Aucun lieu disponible.");




        }



        modifierMdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ouvrirModifierMdp();



            }
        });







    }

    public void ouvrirModifierMdp(){

        Intent page = new Intent(Information.this, ModifierMdp.class);
        startActivity(page);




    }
}
