package com.pokemon;

public abstract class PokemonLegs extends Pokemon {
    private int legs;
    private double size;

    public PokemonLegs(String name, double weight, int legs, double size) {
        super(name, weight);
        this.legs = legs;
        this.size = size;
    }

    @Override
    public double getSpeed() {
        return getLegs() * size * 3;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", my speed is " + getSpeed() + " km / h, I have " + legs + " legs, my height is " + size + " m";
    }

    public double getSize() {
        return size;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

}
