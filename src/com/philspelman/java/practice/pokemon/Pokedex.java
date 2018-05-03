package com.philspelman.java.practice.pokemon;


//Create a Pokedex class that extends the AbstractPokemon class
// and implements pokemonInfo(Pokemon pokemon).


import java.util.ArrayList;
import java.util.Iterator;

public class Pokedex extends AbstractPokemon implements PokemonInterface {
    @Override
    public String pokemonInfo(Pokemon target) {
        System.out.println("reached pokemonInfo() in pokedex extends AbstractPokemon");
        return target.toString();
    }

    private ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();

    public void addPokemon(Pokemon pokemon) {
        System.out.println("adding pokemon!");

        this.pokedex.add(pokemon);
    }

    public void showAllPokemon() {
        System.out.println("trying to show all pokemon");
        for (Iterator<Pokemon> iterator = this.pokedex.iterator(); iterator.hasNext(); ) {
            Pokemon pokemon = iterator.next();
            System.out.println("pokemon goes here");
            System.out.println(pokemon);
        }
    }



    //TODO: implement pokemonInfo(Pokemon target) from the AbstractPokemon Class

}
