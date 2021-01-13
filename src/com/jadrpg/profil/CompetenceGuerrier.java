package com.jadrpg.profil;

public enum CompetenceGuerrier implements ICompetence {
    G11("Protéger un allié", 1, "Voie du bouclier"),
    G12("Absorber un coup", 2, "Voie du bouclier"),
    G13("Absorber un sort", 3, "Voie du bouclier"),
    G14("Armure Lourde", 4, "Voie du bouclier"),
    G21("Vivacité", 1, "Voie du combat"),
    G22("Désarmer", 2, "Voie du combat"),
    G23("Double attaque", 3, "Voie du combat"),
    G24("Attaque circulaire", 4, "Voie du combat"),
    G31("Robustesse", 1, "Voie de la résistance"),
    G32("Armure naturelle", 2, "Voie de la résistance"),
    G33("Second souffle", 3, "Voie de la résistance"),
    G34("Dur à cuire", 4, "Voie de la résistance");

    private final String nom;
    private final int niveau;
    private final String voie;

    CompetenceGuerrier (final String nom, final int niveau, final String voie) {
            this.nom = nom;
            this.niveau = niveau;
            this.voie = voie;
    }

    @Override
    public String getNom () {
        return this.nom;
    }

    @Override
    public String getNomProfil () {
        return "Guerrier";
    }

    @Override
    public int getNiveau () {
        return this.niveau;
    }

    @Override
    public String getVoie () {
        return this.voie;
    }
}
