package com.philspelman.java.practice.objectmaster;
public class Wizard extends Human {


    //DONE: Wizard's get default health of 50
    //DONE: Default intelligence of 8
    Wizard() {
        this("Misc Mage");
    }

    Wizard(String name) {
        super(name, 50);
        this.setIntelligence(8);

    }


    //DONE: Method called heal that heals a target an amount equal to the wizard's intelligence level
    //DONE: Clarify if "heal" method is allowed to heal a target OVER their default health
    public void heal(Human target) {
        System.out.println("healing " + target + " : + " + this.getIntelligence() + " health");
        target.addHealth(this.getIntelligence());
    }

    //DONE: Method called fireball that decreases health of target by 3 x Intelligence (of wizard)
    public void fireball(Human target) {
        System.out.println("fireball at " + target + " did " + (3 * this.getIntelligence()) + "damage ");
        target.addHealth(-(3 * this.getIntelligence()));
    }


}
