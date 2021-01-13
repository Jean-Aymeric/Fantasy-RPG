package com.jadrpg.profil;

import com.jadrpg.caracteristique.Modificateur;

public class Magicien extends Profil {
    public Magicien() {
        super("Magicien");
        this.getModificateurs().add(new Modificateur("PV", 4));
    }
}
