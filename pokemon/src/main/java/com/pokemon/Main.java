package com.pokemon;

public class Main {
    public static void main(String[] args) {
        SportPokemons sportPokemons = new SportPokemons("Pikachu", 10, 2, 0.5, 120);
        StayAtHomePokemons stayAtHomePokemons = new StayAtHomePokemons("Mr.Mime", 60, 2, 1.5, 24);
        SeaPokemons seaPokemons = new SeaPokemons("Azumaril", 100, 2);
        CruisingPokemons cruisingPokemons = new CruisingPokemons("Bulbizarre", 100, 2);

        System.out.println(sportPokemons);
        System.out.println(stayAtHomePokemons);
        System.out.println(seaPokemons);
        System.out.println(cruisingPokemons);
    }
}