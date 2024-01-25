package dam.martin.activitat2;

public class EntrenadorThread extends Thread{
    private int numeroEntrenador;

    public EntrenadorThread(int numeroEntrenador) {
        this.numeroEntrenador = numeroEntrenador;
    }

    @Override
    public void run() {
        System.out.println("Soy el Entrenador número " + this.numeroEntrenador);
    }
}
