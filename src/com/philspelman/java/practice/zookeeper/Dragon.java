package com.philspelman.java.practice.zookeeper;

public class Dragon extends Mammal {
    private String name;  //yes, dragons allegedly come from eggs...whatever


    Dragon() {
        this("Draggy","Dragon");
    }

    Dragon(String name) {
        this(name, "Dragon");
    }

    Dragon(String name, String species) {
        this.name = name;
        this.setSpecies(species);
        this.energyLevel = 300;
    }

    //todo: Make it eat Humans

    //todo: Make it able to attack towns
    public void attackTown() {
        int energy_cost_to_attack_town = 100;
        if (this.energyLevel - 100 <= 0) {
            System.out.println(this + " is too tired to attack a town...maybe eat something");
        } else {
            System.out.println("SOUND OF TOWN ON FIRE!!!");
            this.energyLevel -= energy_cost_to_attack_town;
        }
    }

    //todo: Make it's energy able to be 300 instead of 100
    public void eatHumans() {
        int energy_from_eating_humans = 25;
        //eat humans
        System.out.println("Eating people... + " + energy_from_eating_humans + " energy");
        if (this.energyLevel + energy_from_eating_humans >= 300) {
            this.energyLevel = 300;
        } else {
            this.energyLevel += energy_from_eating_humans;
        }
    }

    //todo: Make it FLY
    public void fly() {
        int energy_cost_to_fly = 50;
        if (this.energyLevel - energy_cost_to_fly <= 0) {
            System.out.println(this + " is too tired to fly...maybe eat something");
        } else {
            this.energyLevel -= energy_cost_to_fly;
            System.out.println("SOUND OF TAKING OFF!");
        }
    }

    @Override
    public String toString() {
        return this.name;
    }




}
