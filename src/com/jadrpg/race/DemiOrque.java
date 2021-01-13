package com.jadrpg.race;

import com.jadrpg.caracteristique.Modificateur;

public class DemiOrque extends Race {
    public DemiOrque() {
        super("Demi-Orque");
        this.getModificateurs().add(new Modificateur("Force", 2));
        this.getModificateurs().add(new Modificateur("Intelligence", -2));
        this.getModificateurs().add(new Modificateur("Charisme", -2));
    }
}
