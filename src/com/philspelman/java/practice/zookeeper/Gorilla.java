package com.philspelman.java.practice.zookeeper;

public class Gorilla extends Mammal {
    private String name;

    Gorilla() {
        this("Unnamed Gorilla");
    }

    Gorilla(String name) {

        this.name = name;
    }

    public void throwSomething() {
        int energy_cost_to_throw = 5;
        if ((this.energyLevel - energy_cost_to_throw) < 1) {
            System.out.println("Too tired to throw anything...maybe eat something");
        } else {
            System.out.println("throwing some poo...");
            this.energyLevel -= energy_cost_to_throw;
        }

    }

    public void eatBananas() {
        System.out.println("eating bananas");
        if (this.energyLevel < 100) {
            if (this.energyLevel + 10 > 100) {
                this.energyLevel = 100;
            } else {
                this.energyLevel += 10;
            }
        }
    }

    public void climb() {
        int energy_cost_to_climb = 10;
        if (this.energyLevel < energy_cost_to_climb) {
            System.out.println("Too tired to climb...maybe eat something");

        } else {
            System.out.println("climbing!");
            this.energyLevel -= energy_cost_to_climb;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
