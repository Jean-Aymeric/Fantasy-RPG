package com;

import com.jadrpg.Personnage;
import com.jadrpg.caracteristique.ICaracteristique;
import com.jadrpg.profil.*;
import com.jadrpg.race.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Personnage personnage = new Personnage(new DemiOgre(), new Guerrier());

        for (ICaracteristique caracteristique : personnage.getCaracteristiques()) {
            System.out.println(caracteristique.getName() + " : " + personnage.getCaracteristique(caracteristique.getName()) +
                    " (" + personnage.getModificateurCaracteristique(caracteristique.getName()) + ")");
        }

        System.out.println("PV : " + personnage.getPv());
        System.out.println("Défense : " + personnage.getDefense ());
        System.out.println("Attaque mélée : " + personnage.getAttaqueMelee());
        System.out.println("Attaque distance : " + personnage.getAttaqueDistance());

        ArrayList<ICompetence> competences = new ArrayList<> ();
        competences.add (CompetenceGuerrier.G11);
        competences.add (CompetenceGuerrier.G21);
        personnage.levelUp (competences);

        for (ICompetence c :personnage.getCompetences ()) {
            System.out.println(c.getVoie () + " : " + c.getNom () + " (" + c.getNiveau () + ")");
        }
    }
}
