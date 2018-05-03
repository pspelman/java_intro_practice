package com.philspelman.java.practice.pokemon;

//Create a Pokemon class with:
//  name, health, and type member variables.
//  a count static variable that keeps the number of Pokemon created in the program.
// getters and setters for each member variable.
//   a constructor class to set the instance's name, health, and type on creation

public class Pokemon {

    public static void main(String[] args) {
        System.out.println("Doing poke stuff");
    }

    private String name;
    private int health;
    private String pokemon_type;


    public static int getTotalPokemonCount() {
        return totalPokemonCount;
    }

    private static int totalPokemonCount;

    public Pokemon() {
        this("nameless", "misc", 100);
    }

    public Pokemon(String name) {
        this(name, "misc",100);
    }

    public Pokemon(String name, String pokemon_type) {
        this(name, pokemon_type, 100);
    }

    public Pokemon(String name, String pokemon_type, int health) {

        this.name = name;
        this.health = health;
        this.pokemon_type = pokemon_type;
        totalPokemonCount++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getPokemon_type() {
        return pokemon_type;
    }

    public void setPokemon_type(String pokemon_type) {
        this.pokemon_type = pokemon_type;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
