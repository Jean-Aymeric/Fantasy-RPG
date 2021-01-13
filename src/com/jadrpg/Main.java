package com.jadrpg;

import com.jadrpg.Personnage;
import com.jadrpg.profil.*;
import com.jadrpg.race.*;
public class Main {

    public static void main(String[] args) {
        Personnage personnage = new Personnage(new Nain(), new Profil());
        System.out.println(personnage.getCaracteristique("Constitution"));
    }
}
