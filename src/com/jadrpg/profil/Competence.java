package com.jadrpg.profil;

public class Competence implements ICompetence {
    private String nom;
    private String nomProfil;
    private int niveau;
    private String voie;

    public Competence (final String nom, final String nomProfil, final int niveau, final String voie) {
        this.nom = nom;
        this.nomProfil = nomProfil;
        this.niveau = niveau;
        this.voie = voie;
    }

    @Override
    public String getNom () {
        return this.nom;
    }

    public void setNom (final String nom) {
        this.nom = nom;
    }

    @Override
    public String getNomProfil () {
        return this.nomProfil;
    }

    public void setNomProfil (final String nomProfil) {
        this.nomProfil = nomProfil;
    }

    @Override
    public int getNiveau () {
        return this.niveau;
    }

    public void setNiveau (final int niveau) {
        this.niveau = niveau;
    }

    @Override
    public String getVoie () {
        return this.voie;
    }

    public void setVoie (final String voie) {
        this.voie = voie;
    }

}
