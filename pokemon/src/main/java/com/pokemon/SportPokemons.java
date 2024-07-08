package com.pokemon;

public class SportPokemons extends PokemonLegs{

    private int heardRate;

    public SportPokemons(String name, double weight, int legs, double size, int heardRate) {
        super(name, weight, legs, size);
        this.heardRate = heardRate;
    }

    public int getHeardRate() {
        return heardRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", my heart rate is " + heardRate + " beats per minute";
    }

    

}
