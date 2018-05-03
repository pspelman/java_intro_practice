package com.philspelman.java.practice.pokemon;
//Create an abstract class that only
// implements createPokemon
// implements attackPokemon from the PokemonInterface.


public abstract class AbstractPokemon implements PokemonInterface {

    public void attackPokemon(Pokemon target){ //needs to be static because it is not abstract
        int attackDamage = 10;
        System.out.println("trying to attack " + target);
        if ((target.getHealth() - attackDamage) <= 0) {
            target.setHealth(0);
            System.out.println(target + " is dead");
        } else {
            target.setHealth(target.getHealth() - attackDamage);
            System.out.println(target + " lost " + attackDamage + " health");
        }
    }

    public Pokemon createPokemon() {
        return new Pokemon("NONAME", "nothing", 100);
    }

    public Pokemon createPokemon(String name) {
        return new Pokemon(name, "nothing", 100);
    }

    public Pokemon createPokemon(String name, String type) {
        return new Pokemon(name, "nothing", 100);
    }

    public Pokemon createPokemon(String name, String type, int health) {
        return new Pokemon();
    }

}
