package com.philspelman.java.practice.objectmaster;

public class Samurai extends Human {

    //DONE: Default health of 200
    private static int counter;


    Samurai() {
        this("Lone Warrior");
    }

    Samurai(String name) {
        super(name, 200);
        this.setHealth(200);
        counter++;
    }

    public static int getNumOfInstances() {
        System.out.println("there are " + counter + " Samurais");
        return counter;
    }

    //DONE: Method called deathBlow - attacks object and decreases object's health to 0 (COSTS 50% Samurai's health)
    public void deathBlow(Human target) {
        System.out.println(this + " dealt a deathblow to " + target);
        target.addHealth(-(target.getHealth()));
        this.addHealth((int) -(Math.floor(this.getHealth() / 2)));
    }


    //DONE: Method called meditate - heals Samurai to full health
    public void meditate() {
        System.out.println("restoring to max health: " + this.getMax_health());
        this.setHealth(this.getMax_health());
    }


    //DONE: Method called howMany that returns current number of Samurai
    public int howMany() {
//        System.out.println("How many? One. Who is...Tom Cruise");
        return getNumOfInstances();
    }



}
