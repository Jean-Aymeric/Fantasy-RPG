package com.jadrpg.caracteristique;

public class Caracteristique implements ICaracteristique {
    private int value;
    private String name;

    public Caracteristique(String name) {
        setValue((int) (Math.random()*6 + 1) + (int) (Math.random()*6 + 1) + (int) (Math.random()*6 + 1));
        setName(name);
    }

    @Override
    public int getValue () {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

    @Override
    public String getName () {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
