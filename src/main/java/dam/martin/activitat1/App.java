package dam.martin.activitat1;

public class App {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String nombreCaballo = "Caballo" + String.format("%02d", i);
            ThreadHorse threadHorse = new ThreadHorse(nombreCaballo);
            Thread caballoThread = new Thread(threadHorse);
            caballoThread.start();
        }
    }
}
