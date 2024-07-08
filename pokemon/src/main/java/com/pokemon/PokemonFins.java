package com.pokemon;

public abstract class PokemonFins extends Pokemon {
    private int fins;

    public PokemonFins(String name, double weight, int fins) {
        super(name, weight);
        this.fins = fins;
    }

    @Override
    public String toString() {
        return super.toString() + ", my speed is " + getSpeed() + " km / h, I have " + fins + " fins";
    }

    @Override
    public double getSpeed() {
        return getWeight()/25 * fins;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }
}
