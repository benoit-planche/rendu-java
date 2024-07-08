package com.pokemon;

public class StayAtHomePokemons extends PokemonLegs {

    private int nbHoursWatchingTV;

    public StayAtHomePokemons(String name, double weight, int legs, double size, int nbHoursWatchingTV) {
        super(name, weight, legs, size);
        this.nbHoursWatchingTV = nbHoursWatchingTV;
    }

    @Override
    public String toString() {
        return super.toString() + ", I watch TV " + nbHoursWatchingTV + " hours a day";
    }

}
