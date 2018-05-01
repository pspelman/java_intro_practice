package com.philspelman.java.practice.zookeeper;

public class ZooKeeper {
    public static void main(String[] args) {
        Mammal whale = new Mammal("whale");

        System.out.println("Species: " + whale.getSpecies());
        whale.displayEnergy();

        Gorilla gorilla = new Gorilla();
        gorilla.displayEnergy();

        gorilla.throwSomething();
        gorilla.displayEnergy();

        gorilla.throwSomething();
        gorilla.displayEnergy();
        gorilla.displayEnergy();

        gorilla.eatBananas();
        gorilla.displayEnergy();
        gorilla.eatBananas();
        gorilla.displayEnergy();

        gorilla.eatBananas();
        gorilla.displayEnergy();

        gorilla.climb();
        gorilla.displayEnergy();
        gorilla.climb();
        gorilla.climb();
        System.out.println("Energy returned: " + gorilla.displayEnergy());

        gorilla.setSpecies("G Money");
        Gorilla bob = new Gorilla("bob");
        bob.setSpecies("G money g");

        System.out.println(bob + "'s species: " + bob.getSpecies());
        System.out.printf("%n%n%n");

        System.out.println("Making a dragon!");
        System.out.println();
        Dragon dragon = new Dragon("Mr. Draggles");
        System.out.println("Your dragon's name: " + dragon);

        System.out.println(dragon + "'s Energy: " + dragon.energyLevel);
        System.out.println();


        dragon.fly();
        dragon.fly();
        dragon.fly();
        dragon.fly();
        dragon.fly();
        dragon.fly();
        dragon.displayEnergy();
        dragon.eatHumans();
        dragon.displayEnergy();
        dragon.attackTown();
        dragon.displayEnergy();












    }
}
