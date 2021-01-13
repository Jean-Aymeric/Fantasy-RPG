package com.jadrpg.race;

import com.jadrpg.caracteristique.Modificateur;

public class DemiOgre extends Race {
    public DemiOgre() {
        super("Demi-Ogre");
        this.getModificateurs().add(new Modificateur("Force", 4));
        this.getModificateurs().add(new Modificateur("Intelligence", -4));
        this.getModificateurs().add(new Modificateur("Charisme", -6));
        this.getModificateurs().add(new Modificateur("Dextérité", 3));
    }
}
