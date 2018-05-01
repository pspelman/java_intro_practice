package com.philspelman.java.practice.objectmaster;

public class DnDTest {
    public static void main(String[] args) {

        Human steve = new Human("Steve");
        System.out.println("My human's anme is: " + steve);

        System.out.println(steve + "'s health: " + steve.getHealth());
        steve.getName();
        steve.getIntelligence();

        Human paul = new Human("Paul");

        System.out.println("Now I have a new human named: " + paul);
        paul.displayHealth();

        paul.attack(steve);
        paul.attack(steve);
        steve.displayHealth();

        paul.attack(steve);



    }
}
