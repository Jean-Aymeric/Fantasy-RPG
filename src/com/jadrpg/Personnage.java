package com.jadrpg;

import com.jadrpg.race.IRace;
import com.jadrpg.profil.IProfil;
import com.jadrpg.caracteristique.Caracteristique;

public class Personnage {

    private IRace race;
    private IProfil profil;

    public Personnage(IRace race, IProfil profil) {
        this.setRace(race);
        this.setProfil(profil);
    }

    private void setRace(IRace race) {
        this.race = race;
    }

    private void setProfil(IProfil profil) {
        this.profil = profil;
    }
    public IRace getRace() {
        return race;
    }

    public IProfil getProfil() {
        return profil;
    }
}
