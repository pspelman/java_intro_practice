package com.philspelman.java.practice.objectmaster;

public class Human {
    private String name;
    private int strength;
    private int intelligence;
    private int stealth;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }


    public int getHealth() {
        return health;
    }

    public void displayHealth() {
        System.out.println(this + "'s current health: " + this.health);
    }

    public void setHealth(int health) {
        if (health + this.health < 0) {
            this.health = 0;
        } else {
            this.health += health;
        }
    }



    Human() {
        this("Unnamed");
    }

    Human(String name) {
        this(name, 3, 3, 3, 100);
    }

    Human(String name, int stealth, int strength, int intelligence, int health) {
        this.name = name;
        this.strength = 3;
        this.intelligence = 3;
        this.stealth = 3;
        this.health = 100;

    }



    public void attack(Human opponent) {
        System.out.println(this + " attacked " + opponent);
        if (opponent.getHealth() <= 0) {
            System.out.println(opponent + " cannot be attacked anymore... ** " + this + " does victory dance **");
        }
        opponent.setHealth(-this.strength);

    }



    @Override
    public String toString() {
        return this.name;
    }

}
