package dam.martin.activitat2;

public class EntrenadorThread extends Thread{
    private int numeroEntrenador;
    private PokemonThread pokemonThread;

    public EntrenadorThread(int numeroEntrenador, PokemonThread pokemonThread) {
        this.numeroEntrenador = numeroEntrenador;
        this.pokemonThread = pokemonThread;
    }

    @Override
    public void run() {
        System.out.println("Soy el Entrenador número " + this.numeroEntrenador);

        try {
            // Esperar a que termine el hilo del Pokémon antes de continuar
            pokemonThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
