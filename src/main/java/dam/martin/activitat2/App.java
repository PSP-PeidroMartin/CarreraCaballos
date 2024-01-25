package dam.martin.activitat2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número par: ");
        int n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("Por favor, ingrese un número par.");
            return;
        }

        for (int i = 1; i <= n; i += 2) {
            PokemonThread pokemonThread = new PokemonThread(i);
            pokemonThread.start();

            // Luego, crear y ejecutar el entrenador correspondiente
            new EntrenadorThread(i + 1, pokemonThread).start();
        }

    }
}
