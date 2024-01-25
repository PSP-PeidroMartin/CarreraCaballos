package dam.martin.activitat2;

public class PokemonThread extends Thread{
    private int numeroPokemon;

    public PokemonThread(int numeroPokemon) {
        this.numeroPokemon = numeroPokemon;
    }

    @Override
    public void run() {
        System.out.println("Soy el Pokémon número " + numeroPokemon);
    }
}
