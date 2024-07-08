package com.pokemon;

public class CruisingPokemons extends PokemonFins {
    
        public CruisingPokemons(String name, double weight, int fins) {
            super(name, weight, fins);
        }

        @Override
        public double getSpeed() {
            return (super.getSpeed())/2;
        }        

}
