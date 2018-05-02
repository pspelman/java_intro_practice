package com.philspelman.java.practice.objectmaster;

public class Human {
    private String name;
    private int strength;
    private int intelligence;
    private int stealth;
    private int health;
    private int max_health;


    protected void setHealth(int health) {
        this.health = health;
    }

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

    public void addHealth(int health) {
        if (health + this.health < 0) {
            this.health = 0;
        } else if (health + this.health >= max_health) {
            System.out.println("Setting health to max: " + max_health);
            this.health = max_health;
        } else {
            this.health += health;
        }
    }



    Human() {
        this("Unnamed");
    }

    Human(String name) {
        this(name, 100, 3, 3, 3);
    }

    Human(String name, int health) {
            this(name, health, 3, 3, 3);
        }


    Human(String name, int health, int stealth, int strength, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.stealth = stealth;
        this.health = health;
        setMaxHealth(health);

    }

    private void setMaxHealth() {
        setMaxHealth(this.health);
    }

    private void setMaxHealth(int max_health) {
        this.max_health = max_health;
    }


    public void attack(Human opponent) {
        System.out.println(this + " attacked " + opponent);
        if (opponent.getHealth() <= 0) {
            System.out.println(opponent + " cannot be attacked anymore... ** " + this + " does victory dance **");
        }
        opponent.addHealth(-this.strength);

    }



    @Override
    public String toString() {
        return this.name;
    }

    public int getMax_health() {
        return max_health;
    }
}
