package com.jadrpg.race;

import com.jadrpg.caracteristique.Modificateur;

import java.util.ArrayList;

public interface IRace {
    ArrayList<Modificateur> getModificateurs();
    int getModificateur(String name);
}
