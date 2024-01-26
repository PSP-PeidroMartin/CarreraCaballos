package dam.martin.activitat4;

public class ThreadHorse implements Runnable{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    String nombreCaballo;

    public ThreadHorse(String nombreCaballo) {
        this.nombreCaballo = nombreCaballo;
    }

    @Override
    public void run() {
        int paso = 100;
        int distanciaTotal = 5000;

        while (distanciaTotal > 0){
            try {
                Thread.sleep(200);
                distanciaTotal -= paso;

                if (distanciaTotal > 0) {
                    System.out.println(nombreCaballo + ": " + distanciaTotal + "metros para finalizar");
                }
            } catch (InterruptedException e) {
                System.err.println(this.nombreCaballo + ": descalificado");
                return;
            }
        }


        System.out.println(ANSI_GREEN + this.nombreCaballo + ": Ha finalizado la carrera" + ANSI_RESET);
    }
}
