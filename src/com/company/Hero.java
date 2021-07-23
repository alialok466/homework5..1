package com.company;

public class Hero {
    private int health;
    private boolean damage;
    private String superpower;


    public Hero(int health, boolean damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero(int health, boolean damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public boolean isDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}
