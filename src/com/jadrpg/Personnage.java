package com.jadrpg;

import com.jadrpg.race.IRace;
import com.jadrpg.profil.IProfil;
import com.jadrpg.caracteristique.Caracteristique;
import java.util.ArrayList;

public class Personnage {
    private IRace race;
    private IProfil profil;

   private int pv;

    private ArrayList<Caracteristique> caracteristiques;

    public Personnage(IRace race, IProfil profil) {
        this.setRace(race);
        this.setProfil(profil);
        this.caracteristiques = new ArrayList<Caracteristique>();
        getCaracteristiques().add(new Caracteristique("Force"));
        getCaracteristiques().add(new Caracteristique("Dextérité"));
        getCaracteristiques().add(new Caracteristique("Constitution"));
        getCaracteristiques().add(new Caracteristique("Intelligence"));
        getCaracteristiques().add(new Caracteristique("Sagesse"));
        getCaracteristiques().add(new Caracteristique("Charisme"));
        getCaracteristiques().add(new Caracteristique("Agilité"));
        this.pv = 0;
    }

    private void setRace(IRace race) {
        this.race = race;
    }

    private void setProfil(IProfil profil) {
        this.profil = profil;
    }

    public ArrayList<Caracteristique> getCaracteristiques() {
        return caracteristiques;
    }

    public int getCaracteristique(String name) {
        for (Caracteristique caracteristique: this.getCaracteristiques()) {
            if (caracteristique.getName() == name) {
                return caracteristique.getValue() + this.getRace().getModificateur(name) + this.getProfil().getModificateur(name);
            }
        }
        return 0;
    }

    public IRace getRace() {
        return race;
    }

    public IProfil getProfil() {
        return profil;
    }

    public int getPv() {
        return pv + this.getProfil().getModificateur("PV");
    }

    public int getModificateurCaracteristique(String name) {
        return (int) (this.getCaracteristique(name) / 2) - 5;
    }

    public int getDefense() {
        return 10 + this.getRace().getModificateur("Dextérité") + this.getProfil().getModificateur("Dextérité");
    }
    public int getAttaqueMelee() {
        return 1 + this.getRace().getModificateur("Force") + this.getProfil().getModificateur("Force");
    }
    public int getAttaqueDistance() {
        return 1 + this.getRace().getModificateur("Dextérité") + this.getProfil().getModificateur("Dextérité");
    }
}
