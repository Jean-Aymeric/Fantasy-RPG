package com.jadrpg.profil;

import com.jadrpg.caracteristique.Modificateur;

public class Voleur extends Profil {
    public Voleur() {
        super("Voleur");
        this.getModificateurs().add(new Modificateur("PV", 6));
    }
}
