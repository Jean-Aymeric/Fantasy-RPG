package com.jadrpg;

import com.jadrpg.profil.ICompetence;
import com.jadrpg.race.IRace;
import com.jadrpg.profil.IProfil;
import com.jadrpg.caracteristique.Caracteristique;
import com.jadrpg.caracteristique.ICaracteristique;
import java.util.ArrayList;

public class Personnage {
    private IRace race;
    private IProfil profil;
    private int pv;

    private void increasePv () {
        this.pv += (int) (Math.random () * this.getProfil ().getModificateur ("PV")) + 1;
    }

    private void setLevel (final int level) {
        this.level = level;
    }

    private int level;
    private final ArrayList<ICaracteristique> caracteristiques;
    private final ArrayList<ICompetence> competences;

    public Personnage(IRace race, IProfil profil) {
        this.setRace(race);
        this.setProfil(profil);
        this.caracteristiques = new ArrayList<>();
        getCaracteristiques().add(new Caracteristique("Force"));
        getCaracteristiques().add(new Caracteristique("Dextérité"));
        getCaracteristiques().add(new Caracteristique("Constitution"));
        getCaracteristiques().add(new Caracteristique("Intelligence"));
        getCaracteristiques().add(new Caracteristique("Sagesse"));
        getCaracteristiques().add(new Caracteristique("Charisme"));
        getCaracteristiques().add(new Caracteristique("Agilité"));
        this.competences = new ArrayList<>();
        this.pv = 0;
        this.level = 0;
    }

    private void setRace(final IRace race) {
        this.race = race;
    }

    private void setProfil(IProfil profil) {
        this.profil = profil;
    }

    public ArrayList<ICaracteristique> getCaracteristiques() {
        return this.caracteristiques;
    }

    public int getCaracteristique(String name) {
        for (ICaracteristique caracteristique: this.getCaracteristiques()) {
            if (caracteristique.getName().equals (name)) {
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

    public int getLevel () {
        return level;
    }

    public int getModificateurCaracteristique(String name) {
        return (this.getCaracteristique(name) / 2) - 5;
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

    public ArrayList<ICompetence> getCompetences () {
        return competences;
    }

    public boolean levelUp(ArrayList<ICompetence> competences) {
        for (ICompetence competence:competences) {
            if (! competence.getNomProfil ().equals (this.getProfil ().getName ())) {
                return false;
            }
            if (competence.getNiveau () > this.getLevel ()+1) {
                return false;
            }
            if (competence.getNiveau () > 1) {
                boolean okVoie = false;
                for (ICompetence c : this.getCompetences ()) {
                    if ( (! c.getVoie ().equals (competence.getVoie ())) && c.getNiveau () == competence.getNiveau ()-1) {
                        okVoie = true;
                    }
                }
                if (! okVoie) {
                    return false;
                }
            }
        }
        this.increasePv ();
        for (ICompetence competence:competences) {
            this.getCompetences ().add (competence);
        }
        this.setLevel (this.getLevel ()+1);
        return true;
    }
}
