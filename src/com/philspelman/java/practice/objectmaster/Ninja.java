package com.philspelman.java.practice.objectmaster;

public class Ninja extends Human {


    //DONE: default stealth of 10

    Ninja() {
        this("Ninja warrior");
    }

    Ninja(String name) {
        super(name, 100);
        this.setStealth(10);
    }

    //DONE: Method called steal that takes health from a target (health taken = Ninja's stealth level)
    public void steal(Human target) {
                    //if the target has more health than the ninja has stealth, then the ninja can get that much health
        if (target.getHealth() > this.getStealth()) {
            this.addHealth(this.getStealth()); //add full amount to self
            target.addHealth(-(this.getStealth())); // take the full amount from target
        } else {
            //if the target doesn't have that much health left, then the ninja can only take as much as they have
            System.out.println(this + " took " + (this.getStealth() - target.getHealth()) + " from " + target);
            this.addHealth(this.getStealth() - target.getHealth()); //add as much health as they have left
            target.addHealth(-(this.getStealth()));
        }

        if (target.getHealth() == 0) {
            System.out.println(this + " killed " + target);
        }
    }

    //DONE: Method called runAway() that decreases self health by 10
    public void runAway() {
        if (this.getHealth() > 10) {
            System.out.println("running away!");
            this.addHealth(-10);
        } else {
            System.out.println("Not healthy enough to run away :( ");
        }
    }


}
