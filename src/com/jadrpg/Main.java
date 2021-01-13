package com.jadrpg;

import com.jadrpg.Personnage;
import com.jadrpg.race.Race;
import com.jadrpg.profil.Profil;

public class Main {

    public static void main(String[] args) {
        Personnage personnage = new Personnage(new Race(), new Profil());
    }
}
