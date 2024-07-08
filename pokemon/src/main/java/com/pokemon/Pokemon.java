package com.pokemon;

public abstract class Pokemon {
    private String name;
    private double weight;

    public Pokemon(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    

    public abstract double getSpeed();

    @Override
    public String toString() {
        return "I am the " + name + " pokemon, my weight is " + weight + " kg";
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public double getWeight() {
        return weight;
    }



    public void setWeight(double weight) {
        this.weight = weight;
    }

    

}
