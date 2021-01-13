package com.jadrpg.race;

import com.jadrpg.caracteristique.Modificateur;

public class Elfe extends Race {
    public Elfe() {
        super("Elfe");
        this.getModificateurs().add(new Modificateur("Dexterité", 2));
        this.getModificateurs().add(new Modificateur("Force", -2));
    }
}
