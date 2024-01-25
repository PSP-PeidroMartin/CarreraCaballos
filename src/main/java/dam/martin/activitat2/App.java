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
            EntrenadorThread trainerThread = new EntrenadorThread(i + 1);
            PokemonThread pokemonThread = new PokemonThread(i);


            trainerThread.start();

            try {
                trainerThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            pokemonThread.start();

            try {
                pokemonThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
