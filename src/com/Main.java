package com;

import com.jadrpg.Personnage;
import com.jadrpg.caracteristique.Caracteristique;
import com.jadrpg.profil.*;
import com.jadrpg.race.*;

public class Main {
    public static void main(String[] args) {
        Personnage personnage = new Personnage(new Nain(), new Magicien());

        for (Caracteristique caracteristique : personnage.getCaracteristiques()) {
            System.out.println(caracteristique.getName() + " : " + caracteristique.getValue() +
                    " (" + personnage.getModificateurCaracteristique(caracteristique.getName()) + ")");
        }
        System.out.println("PV : " + personnage.getPv());
        System.out.println("Défense : " + personnage.getPv());
        System.out.println("Attaque mélée : " + personnage.getAttaqueMelee());
        System.out.println("Attaque distance : " + personnage.getAttaqueDistance());
    }
}
