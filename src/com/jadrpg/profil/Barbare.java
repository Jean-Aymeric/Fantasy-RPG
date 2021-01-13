package com.jadrpg.profil;

import com.jadrpg.caracteristique.Modificateur;

public class Barbare extends Profil {
    public Barbare() {
        super("Barbare");
        this.getModificateurs().add(new Modificateur("PV", 12));
        this.getModificateurs().add(new Modificateur("Sagesse", -10));
        this.getModificateurs().add(new Modificateur("Force", +2));
    }
}
