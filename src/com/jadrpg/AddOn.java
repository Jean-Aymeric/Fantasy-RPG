package com.jadrpg;

import com.jadrpg.caracteristique.Modificateur;

import java.util.ArrayList;

public abstract class AddOn {
    private String name;
    private ArrayList<Modificateur> modificateurs;

    public AddOn(String name) {
        this.setName(name);
        this.modificateurs = new ArrayList<Modificateur>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public ArrayList<Modificateur> getModificateurs() {
        return modificateurs;
    }

    public int getModificateur(String name) {
        for (Modificateur modificateur : this.getModificateurs()) {
            if (modificateur.getName() == name) {
                return modificateur.getValue();
            }
        }
        return 0;
    }
}
