package com.jadrpg.profil;

import com.jadrpg.caracteristique.Modificateur;

public class Guerrier extends Profil {
    public Guerrier() {
        super("Guerrier");
        this.getModificateurs().add(new Modificateur("PV", 10));
    }
}
