package com.jadrpg.caracteristique;

public class Modificateur {
    private int value;
    private String name;

    public Modificateur(String name, int value) {
        setName(name);
        setValue(value);
    }

    public int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

}
