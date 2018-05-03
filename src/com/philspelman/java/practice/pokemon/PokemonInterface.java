package com.philspelman.java.practice.pokemon;
//Create an interface for the following methods:
//
//  createPokemon(String name, int health, String type): This method creates and returns Pokemon.
//  attackPokemon(Pokemon pokemon): This method lowers the attacked Pokemon's health by 10 and returns void
//  pokemonInfo(Pokemon pokemon): This method returns a String with the name, health, and type of the pokemon
//

public interface PokemonInterface {
    default void sayHello() {
        System.out.println(this + " says hello!");
    }

    void attackPokemon(Pokemon target);

    Pokemon createPokemon();
    Pokemon createPokemon(String name);
    Pokemon createPokemon(String name, String type);
    Pokemon createPokemon(String name, String type, int health);

    String pokemonInfo(Pokemon target);


}
