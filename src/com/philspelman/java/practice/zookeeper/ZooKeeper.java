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

    }
}
