package com.jadrpg.profil;

import com.jadrpg.caracteristique.Modificateur;

public class Pretre extends Profil {
    public Pretre() {
        super("Prêtre");
        this.getModificateurs().add(new Modificateur("PV", 8));
    }
}
