package com.jadrpg.profil;

import com.jadrpg.caracteristique.Modificateur;

public class Necromant extends Profil {
    public Necromant() {
        super("Nécromant");
        this.getModificateurs().add(new Modificateur("PV", 4));
        this.getModificateurs().add(new Modificateur("Sagesse", 2));
        this.getModificateurs().add(new Modificateur("Agilité", -15));
    }
}
