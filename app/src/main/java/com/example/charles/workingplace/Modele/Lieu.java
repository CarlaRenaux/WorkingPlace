package com.example.charles.workingplace.Modele;


public class Lieu {

    private String adresse;
    private int capacite;
    private String description;
    private boolean statut;
    private int id;
    private String ville;
    private int codepostal;

    public Lieu(){
        adresse = "Inconnu";
        ville = "Inconnu";
        codepostal = 0;
        capacite = 0;
        description = "Inconnu";
        statut= false;
        id = 0;
    }
    public Lieu(String adresse, String ville, int codepostal, int capacite, String description, int id){

        this.adresse = adresse;
        this.capacite = capacite;
        this.description= description;
        this.id = id;
        this.ville = ville;
        this.codepostal = codepostal;


    }

    public String getVille() { return ville; }

    public void setVille(String ville) { this.ville = ville; }

    public int getCodepostal() { return codepostal; }

    public void setCodepostal(int codepostal) { this.codepostal = codepostal; }



    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public int getCapacite() {
        return capacite;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean getStatut() {
        return statut;
    }
    public void setStatut(boolean statut) {
        this.statut = statut;
    }
    public int getId() {
        return id;
    }







}
