package com.jadrpg.race;

import com.jadrpg.caracteristique.Modificateur;

public class Nain extends Race {
    public Nain() {
        super("Nain");
        this.getModificateurs().add(new Modificateur("Constitution", 2));
        this.getModificateurs().add(new Modificateur("Dextérité", -2));
    }
}
