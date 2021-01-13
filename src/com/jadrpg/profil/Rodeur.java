package com.jadrpg.profil;

import com.jadrpg.caracteristique.Modificateur;

public class Rodeur extends Profil {
    public Rodeur() {
        super("Rôdeur");
        this.getModificateurs().add(new Modificateur("PV", 8));
    }
}
