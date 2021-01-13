package com.jadrpg;

import com.jadrpg.caracteristique.Modificateur;

import java.util.ArrayList;

public interface IAddOn {
    ArrayList<Modificateur> getModificateurs();
    int getModificateur(String name);
    String getName();
}
