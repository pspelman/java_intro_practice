package com.philspelman.java.practice.zookeeper;

public class Mammal {
    private String species;
    protected int energyLevel;
    private double weight;
    private double height;
    private int age;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mammal() {
        this("unknown",100 );
    }

    public Mammal(String species) {
        this(species,100 );
    }

    public Mammal(String species, int energyLevel) {
        this.species = species;
        this.energyLevel = energyLevel;
    }


    public int displayEnergy() {
        System.out.println("Current energy level: " + this.energyLevel);

        return this.energyLevel;
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
